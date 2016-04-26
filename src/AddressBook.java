import java.util.Collections;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

		public static void Output(ArrayList<ABItem> dataList) {
			for (ABItem curVal : dataList){
				System.out.format("%s , %s , %s , %s\n", curVal.firstName, 
						curVal.lastName, curVal.phoneNumber, curVal.companyName);
				}
		}
		
		public static void main(String[] args) {
			System.out.println("Welcome to Address Book!");
			Scanner scanner = new Scanner(System.in);


			ArrayList<ABItem> dataList = new ArrayList<ABItem>();
			ArrayList<ABItem> firstNameList = new ArrayList<ABItem>();
			ArrayList<ABItem> lastNameList = new ArrayList<ABItem>();
			ArrayList<ABItem> phoneNumberList = new ArrayList<ABItem>();
			ArrayList<ABItem> companyNameList = new ArrayList<ABItem>();

			BufferedReader br = null;

			try {

				String sCurrentLine;
				br = new BufferedReader(new FileReader(
						"C:\\Users\\Rachel Chen\\Desktop\\SmallAddressBook.csv"));

				int i = 0;
				while ((sCurrentLine = br.readLine()) != null) {

					ABItem t = new ABItem();
					String[] arr = sCurrentLine.split(",");
					t.firstName = arr[0]; 
					t.lastName = arr[1];
					t.phoneNumber = arr[2]; 
					t.companyName = arr[3];
					dataList.add(t);
				}

			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if (br != null)
						br.close();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}

			
			for (int i = 0; i < dataList.size(); i++) { 
				firstNameList.add(dataList.get(i));
				lastNameList.add(dataList.get(i));
				phoneNumberList.add(dataList.get(i));
				companyNameList.add(dataList.get(i));
			}
			
			
			Collections.sort(firstNameList, new FirstName());
			Collections.sort(lastNameList, new LastName());
			Collections.sort(phoneNumberList, new PhoneNumber());
			Collections.sort(companyNameList, new CompanyName());
			
			String Method;
			System.out.println("What would you like to search on? (F,L,P,C)");	
		    Method = scanner.nextLine();
		    
		    ArrayList<ABItem> resList = new ArrayList<ABItem>();
		    String searchString;
		    
		    switch (Method)
		    {
		    case "F":
		    	System.out.println("Enter Partial of the First Name:");
		    	searchString = scanner.nextLine();

				for (ABItem curVal : firstNameList){
				  if (curVal.firstName.contains(searchString)){
				    resList.add(curVal);
				  }
				}
				
				AddressBook.Output(resList);
				
				
				System.out.println("Total "+resList.size()+" matches\n");
				break;
				
		    case "L":
		    	System.out.println("Enter Partial of the Last Name:");
		    	searchString = scanner.nextLine();
				

				for (ABItem curVal : firstNameList){
				  if (curVal.firstName.contains(searchString)){
				    resList.add(curVal);
				  }
				}
				
				AddressBook.Output(resList);
				
				
				System.out.println("Total "+resList.size()+" matches\n");
				break;
				
		    case "P":
		    	System.out.println("Enter Partial of the Phone Number:");
		    	searchString = scanner.nextLine();
				
				for (ABItem curVal : firstNameList){
				  if (curVal.firstName.contains(searchString)){
				    resList.add(curVal);
				  }
				}
				
				AddressBook.Output(resList);
				
				
				System.out.println("Total "+resList.size()+" matches\n");
				break;
				
		    case "C":
		    	System.out.println("Enter Partial of the Company Name:");
		    	searchString = scanner.nextLine();
				

				for (ABItem curVal : firstNameList){
				  if (curVal.firstName.contains(searchString)){
				    resList.add(curVal);
				  }
				}
				
				AddressBook.Output(resList);
				
				
				System.out.println("Total "+resList.size()+" matches\n");
				break;
		    	}
		}



	}


