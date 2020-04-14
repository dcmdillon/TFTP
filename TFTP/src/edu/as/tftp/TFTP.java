package edu.as.tftp;

public class TFTP {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("More information needed. Printing help (--?, --help)");
			printHelp();
		} else {
			for (int i = 0; i < args.length - 2; i++) {
				String arg = args[i];
				switch (arg) {
				case "test":
					
					break;
				default:
					printHelp();
					break;
				}
			}
		}

	}

	public static void printHelp() {
		System.out.println("Help");
	}

}
