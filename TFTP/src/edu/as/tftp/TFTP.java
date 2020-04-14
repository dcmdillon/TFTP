package edu.as.tftp;

public class TFTP {

	static boolean helpPrinted = false;

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

		/// this is currently just an example help output from another one of my command
		/// line programs

		if (!helpPrinted) {
			System.out.println("Usage: pavarta [options] <imageprefix> <output file>");
			System.out.println("\t imageprefix -> \t images must end in a four digit number padded by zeros");
			System.out
					.println("\t\t\t\t if the first file is named inputImage0000.png, the prefix would \"inputImage\"");
			System.out.println("\t output file -> \t file name of output pdf. Must include file extension");
			System.out.println("\t\t\t\t EX: \"outputFile.pdf\"");

			System.out.println("\t [OPTIONS]   ---------");
			System.out.println("\t\t -fi, -firstin, -inoff:\t Sets the suffix number of the first input page");
			System.out.println("\t\t\t\t\t If the first input page of signature 3 is the 32nd page use \"-inoff 32\"");
			System.out.println("\t\t -fo, -firstout, -outoff:\t Sets the suffix number of the first output page");
			helpPrinted = true;
		}
	}

	public static void exit(boolean inProcess) {
		System.out.print("System Exiting");
		if (inProcess) {
			System.out.print(" while in process");
		}
		System.out.println("...");
		System.exit(0);
	}

}
