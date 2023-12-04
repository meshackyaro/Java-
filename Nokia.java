import java.util.Scanner;
public class Nokia{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter number 1 to 13 to access menu");
	System.out.print("1. Phonebook\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services\n");
	int menu = scanner.nextInt();

switch(menu){
	case 1:
		System.out.println("Phonebook");
		System.out.println("1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags");
		System.out.println("Enter number 1 to 10 to access Phonebook");
		int phonebook = scanner.nextInt();

	switch(phonebook){
		case 1: System.out.println("Search");
		break;
		case 2: System.out.println("Service Nos.");
		break;
		case 3: System.out.println("Add name");
		break;
		case 4: System.out.println("Erase");
		break;
		case 5: System.out.println("Edit");
		break;
		case 6: System.out.println("Assign tone");
		break;
		case 7: System.out.println("Send b'card");
		break;
		case 8: System.out.println("Options");
			System.out.println("1. Type of view\n2. Memory status");
			System.out.println("Enter 1 or 2 to access Options");
			int options = scanner.nextInt();
			
		switch(options){
			case 1: System.out.println("Type of view");
			break;
			case 2: System.out.println("Memory");
			break;}

		case 9: System.out.println("Speed dials");
		break;
		case 10: System.out.println("Voice tags");
		break;}

	case 2: 
		System.out.println("Messages");
		System.out.println("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info services\n9. Voice mailbox number\n10. Service command editor");
		System.out.println("Enter number 1 to 10 to access Messsages");
		int messages = scanner.nextInt();

	switch(messages){
		case 1: System.out.println("Write messages");
		break;
		case 2: System.out.println("Inbox");
		break;
		case 3: System.out.println("Outbox");
		break;
		case 4: System.out.println("Picture messgaes");
		break;
		case 5: System.out.println("Templates");
		break;
		case 6: System.out.println("Smileys");
		break;
		case 7: System.out.println("Message settings");
		System.out.println("1. Set 1\n2. Memory status");
		System.out.println("Enter 1 or 2 to access Message settings");
		int messageSettings = scanner.nextInt();

		switch(messageSettings){
			case 1: System.out.println("Set 1");
			System.out.println("1. Message centre\n2. Message sent as\n3. Message validity");
			System.out.println("Enter 1 to 3 to access Set 1");
			int set1 = scanner.nextInt();
			switch(set1){
				case 1: System.out.println("Message center");
				break;
				case 2: System.out.println("Message sent as");
				break;
				case 3: System.out.println("Message validity");              }
				break;
			case 2: System.out.println("Common");
			System.out.println("1. Delivery reports\n2. Reply via same center\n3. Character support");
			System.out.println("Enter 1 to 3 to access Common");
			int common = scanner.nextInt();
			switch(common){
				case 1: System.out.println("Delivery reports");
				break;
				case 2: System.out.println("Reply via same center");
				break;
				case 3: System.out.println("Character support");
				break;}
		break;}
		case 8: System.out.println("Info services");
		break;
		case 9: System.out.println("Voice mailbox");
		break;
		case 10: System.out.println("Service command editor");
		break;}

	case 3: 
		System.out.println("Chat");
		int chat = scanner.nextInt();
		break;
	case 4: 
		System.out.println("Call register");
		System.out.println("1. Missed calls\n2. Received calls\n3. Dialled calls\n4. Erase recent calls\n5. Show calls' duration\n6. Show call cost\n7. Call cost settings\n8. Prepaid cost");
		System.out.println("Enter number 1 to 8 to access Call register");
		int callRegister = scanner.nextInt();

	switch(callRegister){
		case 1: System.out.println("Missed calls");
		break;
		case 2: System.out.println("Received calls");
		break;
		case 3: System.out.println("Dialled calls");
		break;
		case 4: System.out.println("Erase recent calls");
		break;
		case 5: System.out.println("Show calls duration");
			System.out.println("1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dialled calls' duration\n5. Clear timers");
			System.out.println("Enter 1 to 5 to access Calls duration");
			int callDuration = scanner.nextInt();
		switch(callDuration){
			case 1: System.out.println("Last call duration");
			break;
			case 2: System.out.println("All calls' duration");
			break;
			case 3: System.out.println("Received calls' duration");
			break;
			case 4: System.out.println("Dialled calls' duration");
			break;
			case 5: System.out.println("Clear timers");
			break;}
		break;
		case 6: System.out.println("Show call cost");
			System.out.println("1. Last call cost\n2. All calls' cost\n3. Cear counters");
			System.out.println("Enter 1 or 2 to access Call costs");
			int callCosts = scanner.nextInt();
		switch(callCosts){
			case 1: System.out.println("Last call cost");
			break;
			case 2: System.out.println("All calls' cost");
			break;}
		break;
		case 7: System.out.println("Call cost settings");
			System.out.println("1. Call cost limit\n2. Show costs in");
			System.out.println("Enter 1 or 2 to access Call costs settings");
			int callCostSettings = scanner.nextInt();
		switch(callCostSettings){
			case 1: System.out.println("Call cost limit");
			break;
			case 2: System.out.println("Show costs in");
			break;}
		break;
		case 8: System.out.println("Prepaid cost");
		break;}

	case 5: 
		System.out.println("Tones");
		System.out.println("1. Ringing tone\n2. Ringing volume\n3. Incoming alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warming and game tones\n8. Vibrating alert\n9. Screen saver");
		System.out.println("Enter number 1 to 9 to access Tones");
		int tones = scanner.nextInt();
	
	switch(tones){
		case 1: System.out.println("Ringing tone");
		break;
		case 2: System.out.println("Ringing volume");
		break;
		case 3: System.out.println("Incoming alert");
		break;
		case 4: System.out.println("Composer");
		break;
		case 5: System.out.println("Message alert tone");
		break;
		case 6: System.out.println("Keypad tones");
		break;
		case 7: System.out.println("Warning and game tones");
		break;
		case 8: System.out.println("Vibrating alert");
		break;
		case 9: System.out.println("Screen saver");
		break;}
	
	case 6:
		System.out.println("Settings");
		System.out.println("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
		System.out.print("Enter number 1 to 4 to access Settings");
		int settings = scanner.nextInt();
		int callSettings = scanner.nextInt();
	
	switch(settings){
		case 1: System.out.println("Call settings");
		if(callSettings == 1){
		System.out.print("Automatic Redial");
		}
		if(callSettings == 2){
		System.out.println("Speed dialling");
		}
		if(callSettings == 3){
		System.out.print("Call waiting options");
		}
		if(callSettings == 4){
		System.out.println("Own number sending");
		}
		if(callSettings == 5){
		System.out.print("Phone line in use");
		}
		if(callSettings == 6){
		System.out.print("Automatic answer");
		}
		break;
		case 2: System.out.println("Phone settings");
		break;
		case 3: System.out.println("Security settings");
		break;
		case 4: System.out.println("Restore factory settings");
		break;}

	case 7:
		System.out.println("Call divert");
		int callDivert = scanner.nextInt();

	case 8:
		System.out.println("Games");
		int games = scanner.nextInt();
	
	case 9:
		System.out.println("Calculaotr");
		int calculator = scanner.nextInt();

	case 10:
		System.out.println("Reminders");
		int reminders = scanner.nextInt();
	
	case 11:
		System.out.println("Clock");
		System.out.println("1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stop watch\n5. Countdown timer\n6. Auto update");
		System.out.println("Enter number 1 to 6 to access Clock");
		int clock = scanner.nextInt();

	switch(clock){
		case 1: System.out.println("Alarm clock");
		break;
		case 2: System.out.println("Clock settings");
		break;
		case 3: System.out.println("Date settings");
		break;
		case 4: System.out.println("Countdown timer");
		break;
		case 5: System.out.println("Auto update");
		break;}

	case 12:
		System.out.println("Profiles");
		int profiles = scanner.nextInt();
	
	case 13:
		System.out.println("SIM services");
		int simServices = scanner.nextInt();
	
		}	
	}
}
