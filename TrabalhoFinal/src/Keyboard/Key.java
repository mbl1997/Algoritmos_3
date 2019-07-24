/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keyboard;
import java.io.*;
import java.util.*;

/**
 *
 * @author marib
 */
public class Key {
    
private static InputStreamReader is = new InputStreamReader( System.in );

        private static BufferedReader br = new BufferedReader( is );

        private static StringTokenizer st;

        private static String nt;

        private static boolean debug = false;


                private static StringTokenizer getToken() throws IOException, NullPointerException 
                 {
                 String s = br.readLine();
                 return new StringTokenizer(s);
                 } 


                public static boolean readBoolean() 
                 {
                 return readBoolean(true);
                 }

                public static boolean readBoolean(boolean defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken(); 
                   
                   
                   if (nt.equalsIgnoreCase("true") ||        
                //       nt.equalsIgnoreCase("t") ||           
                 //      nt.equalsIgnoreCase("yes") ||         
                  //     nt.equalsIgnoreCase("y") ||          
                  //    nt.equalsIgnoreCase("on") ||         
                  //     nt.equalsIgnoreCase("v") ||          
                  //     nt.equalsIgnoreCase("s") ||           
                  //     nt.equalsIgnoreCase("sim") ||        
                       nt.equalsIgnoreCase("verdadeiro"))    
                       return true; 
                  
                   else if (nt.equalsIgnoreCase("false") ||  
                     //       nt.equalsIgnoreCase("f") ||      
                      //     nt.equalsIgnoreCase("no") ||     
                       //    nt.equalsIgnoreCase("n") ||      
                        //    nt.equalsIgnoreCase("off") ||    
                         //   nt.equalsIgnoreCase("nao") ||    
                      //      nt.equalsIgnoreCase("nÃ£o") ||    
                            nt.equalsIgnoreCase("falso"))    
                       return false; 
                  
                   else return defaultvalue;
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um boolean. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NoSuchElementException nsee) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um boolean. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 } 


                public static byte readByte() 
                 {
                 return readByte((byte)0);
                 } 

                public static byte readByte(byte defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken(); 
                
                   return Byte.parseByte(nt);
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um byte. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NumberFormatException nfe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de conversÃ£o de "+nt+" para um byte. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 catch (NoSuchElementException nsee) 
                   {
                   if (debug)
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um byte. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 } 


                        public static short readShort() 
                         {
                         return readShort((short)0);
                         } 


                public static short readShort(short defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken(); 
               
                   return Short.parseShort(nt);
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um short. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NumberFormatException nfe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de conversÃ£o de "+nt+" para um short. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 catch (NoSuchElementException nsee)
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um short. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 } 

                public static int readInt() 
                 {
                 return readInt(0);
                 } 

                public static int readInt(int defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken(); 
               
                   return Integer.parseInt(nt);
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um int. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NumberFormatException nfe) 
                   {
                   if (debug)
                     System.err.println("KEYBOARD:: Erro de conversÃ£o de "+nt+" para um int. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 catch (NoSuchElementException nsee) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um int. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 } 


                public static long readLong() 
                 {
                 return readLong(0l);
                 }

                public static long readLong(long defaultvalue) 
                 {
                 try 
                   {
                   st = getToken();
                   nt = st.nextToken();
                   
                   return Long.parseLong(nt);
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um long. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NumberFormatException nfe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de conversÃ£o de "+nt+" para um long. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 catch (NoSuchElementException nsee)
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um long. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 }


                public static float readFloat() 
                 {
                 return readFloat(0f);
                 } 

                public static float readFloat(float defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken(); 
                  
                   if (nt.toLowerCase().startsWith("nan")) return Float.NaN;
                   else if (nt.toLowerCase().startsWith("inf")) return Float.POSITIVE_INFINITY;
                   else if (nt.toLowerCase().startsWith("+inf")) return Float.POSITIVE_INFINITY;
                   else if (nt.toLowerCase().startsWith("-inf")) return Float.NEGATIVE_INFINITY;
                
                   else return Float.parseFloat(nt);
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um float. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NumberFormatException nfe) 
                   {
                   if (debug)
                     System.err.println("KEYBOARD:: Erro de conversÃ£o de "+nt+" para um float. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 catch (NoSuchElementException nsee) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um float. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 } 


                public static double readDouble() 
                 {
                 return readDouble(0.0);
                 } 

                public static double readDouble(double defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken();
                  
                   if (nt.toLowerCase().startsWith("nan")) return Double.NaN;
                   else if (nt.toLowerCase().startsWith("inf")) return Double.POSITIVE_INFINITY;
                   else if (nt.toLowerCase().startsWith("+inf")) return Double.POSITIVE_INFINITY;
                   else if (nt.toLowerCase().startsWith("-inf")) return Double.NEGATIVE_INFINITY;
                  
                   return Double.parseDouble(nt);
                   }
                 catch (IOException ioe)
                   {
                   if (debug)
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um double. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NumberFormatException nfe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de conversÃ£o de "+nt+" para um double. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 catch (NoSuchElementException nsee) 
                   {
                   if (debug)
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um double. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 } 

                public static char readChar() 
                 {
                 return readChar(' ');
                 } 

                public static char readChar(char defaultvalue) 
                 {
                 try 
                   {
                   st = getToken(); 
                   nt = st.nextToken(); 
                  
                   return nt.charAt(0);
                   }
                 catch (IOException ioe)
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo um char. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 catch (NoSuchElementException nsee) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Entrada nÃ£o contÃ©m um char. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue; 
                   }
                 } 

                public static String readString() 
                 {
                 return readString("");
                 } 

                public static String readString(String defaultvalue) 
                 {
                 try 
                   {
                   nt = br.readLine(); 
                   if (nt.trim().length() == 0) 
                     return defaultvalue; 
                   else return nt; 
                   }
                 catch (IOException ioe) 
                   {
                   if (debug) 
                     System.err.println("KEYBOARD:: Erro de entrada e saÃ­da lendo uma string. "+
                                        "Retorna "+defaultvalue);
                   return defaultvalue;
                   }
                 } 

                public static void debugOn() 
                 {
                 debug = true;
                 System.err.println("KEYBOARD:: Mostrando mensagens de erro e avisos...");
                 } 

                public static void debugOff() 
                 {
                 debug = false;
                 } 

                }
