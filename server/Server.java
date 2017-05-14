package client.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static void main(String args[]) {
        int port = 12000;
        try {
            PrintWriter prntwrt;
            FileWriter filewrt;
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println("Started");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String inputLine = null;
            String passLine = null;
            String userLine = null;
            String whatToDo = null;

            String ipAdress = "" + serverSocket.getInetAddress().getHostAddress();
            String serverPort = "" + serverSocket.getLocalPort();
            System.out.println("Server Ip Adress is " + ipAdress);
            System.out.println("Server Port is " + serverPort);
            System.out.println("Server is wait...");
            while (true) {
                inputLine = dataInputStream.readUTF();
                
                String[] userData = inputLine.split("=");
                userLine = "" + userData[0];
                passLine = "" + userData[1];
                whatToDo = "" + userData[2];
                System.out.println("Date was come's "+userLine+"-"+passLine+"-"+whatToDo);
                int userNum = 1;
                int firstUser = 1;
                int Chose = 0;
                int ChosePass = 0;
                BufferedReader reader = null;
                BufferedReader readerPass = null;
                String sCurrentLineLogin = null;
                String sCurrentLinePassw = null;
                reader = new BufferedReader(new FileReader("UserDataBase.txt"));
                readerPass = new BufferedReader(new FileReader("UserPassBase.txt"));
                    
                if(whatToDo.equals("reg")){
                    while ((sCurrentLineLogin = reader.readLine()) != null) {
                            if (sCurrentLineLogin.equals(userLine)) {
                                System.out.println("This user are already sing up");
                                userNum = 1;
                                reader.close();
                                break;
                            }
                            Chose++;
                    }
                    
                    while ((sCurrentLinePassw = readerPass.readLine()) != null && whatToDo.equals("reg")) {
                        ChosePass++;
                        if (passLine.equals(sCurrentLinePassw)) {
                            dataOutputStream.writeUTF(userLine + "=" + passLine);
                            dataOutputStream.flush();
                            break;
                        }
                    }
                }  
                if(whatToDo.equals("log")){
                    while ((sCurrentLineLogin = reader.readLine()) != null) {
                            if (sCurrentLineLogin.equals(userLine)) {
                                userNum = 1;
                                reader.close();
                                break;
                            }
                    }
                    
                    while ((sCurrentLinePassw = readerPass.readLine()) != null) {
                        if (passLine.equals(sCurrentLinePassw)) {
                            dataOutputStream.writeUTF(userLine + "=" + passLine);
                            dataOutputStream.flush();
                            break;
                        }
                    }
                }
                    
                if (userNum != 1 && whatToDo.equals("reg")) {
                    Thread.sleep(500);
                    System.out.println("New client name is: " + userLine);
                    System.out.println("New client pass is: " + passLine);
                    new File("C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + userLine).mkdir();
                    new File("C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + userLine + "\\logAcces.txt").createNewFile();
                    new File("C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + userLine+"\\ForeignImage" ).mkdir();

                    prntwrt = new PrintWriter(filewrt = new FileWriter("C:\\Users\\neyro\\OneDrive\\Documents\\NetBeansProjects\\Client Server\\src\\" + userLine + "\\logAcces.txt", true));
                    prntwrt.println(userLine);
                    prntwrt.flush();
                    filewrt.flush();

                    prntwrt = new PrintWriter(filewrt = new FileWriter("UserDataBase.txt", true));
                    prntwrt.println(userLine);
                    prntwrt.flush();
                    filewrt.flush();

                    prntwrt = new PrintWriter(filewrt = new FileWriter("UserPassBase.txt", true));
                    prntwrt.println(passLine);
                    prntwrt.flush();
                    filewrt.flush();

                    dataOutputStream.writeUTF("true");
                    dataOutputStream.flush();
                } 
                if (whatToDo.equals("log")&& userNum == 1){
                    dataOutputStream.writeUTF("logThisUser="+passLine);
                    dataOutputStream.flush();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
