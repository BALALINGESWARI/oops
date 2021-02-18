//package interview_programs;
//
//
//
//	
//		// TODO Auto-generated method stub
//		/*
//		 *Refer the PDF for task details
//		*/
//
//		import java.util.*;
//		import java.io.*;
//		import java.nio.file.Files;
//		import java.nio.file.Paths;
//
//		/*
//		 * Should not use 
//		 * javax.xml.* or 
//		 * org.w3c.* or
//		 * org.jsoup.* or
//		 * any other such libraries
//		 * You should find the logic from scratch
//		*/
//
//		public class InerviewHizili {
//			
//			public static void main(String[] args) throws IOException {
//
//				String inputHTMLTags = new String(Files.readAllBytes(Paths.get("htmlFile.txt")));
////				System.out.println(inputHTMLTags);
//
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter 1 to enter the line number or 2 to enter the tag name:");
//				int userInput1 = sc.nextInt();
//				
//				switch(userInput1) {
//					case 1:
//						System.out.println("Enter the line number:");
//						int lineNumber = sc.nextInt();
//						findchildUsingLineNumber(inputHTMLTags, lineNumber);
//						break;
//					case 2:
//						System.out.println("Enter the tag name:");
//						sc.nextLine();
//						String tagName = sc.nextLine();
//						findchildUsingTagName(inputHTMLTags, tagName);
//						break;
//					default:
//							System.out.println("Invalid Option at Switch");
//				}
//			}
//
//			public static void findchildUsingLineNumber(String inputHTMLTags, int lineNumber) {
//
//				ArrayList<String> child1 = new ArrayList<String>();
//
//				/*
//				 * Write your logic here
//				*/
//				child1.add("Bala");
//				child1.add("karthi");
//				child1.add("vicky");
//				child1.add("satha");
//				System.out.println("Output: "+child1);
//				
//				ArrayList<String> child2 = new ArrayList<String>();
//				
//				child2.add("swathi");
//				child2.add("sudar");
//				
//				System.out.println("Output: "+child2);
//				
//				ArrayList<String> child3 = new  ArrayList<String>();
//			}
//
//			public static void findchildUsingTagName(String inputHTMLTags, String tagName) {
//
//				ArrayList<String> child = new ArrayList<String>();
//
//				/*
//				 * Write your logic here
//				*/
//
//				System.out.println("Output: "+child);
//			}
//
//		}
//		
//
//	}
//
//}
