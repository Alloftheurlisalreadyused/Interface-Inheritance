import java.util.Scanner;
import java.util.Vector;

import Character.AllRounder;
import Character.Artist;
import Character.BaseCharacter;
import Character.Chef;
import Character.Driver;
import Character.Incompetent;
import Character.Worker;
import Interface.Iartist;
import Interface.Ichef;
import Interface.Idriver;
import Interface.Iworker;

public class Main {
	
	Scanner scan=new Scanner(System.in);
	Vector<BaseCharacter>chara=new Vector<>();
	
	private void init() {
		chara.add(new Chef());
		chara.add(new Driver());
		chara.add(new Worker());
		chara.add(new Artist());
		chara.add(new AllRounder());
		chara.add(new Incompetent());
	}
	
	public Main() {
		String input=null;
		init();
		System.out.println("Simulasi kelompok kemampuan");
		for(int i=0;i<chara.size();i++) {
			System.out.println(i+":"+chara.get(i).getName());
		}
		while(true){
			System.out.print("Input: ");
			input=scan.nextLine();
			
			try {
				String[] inputarr=input.split(" ");
				String[] inputnum=inputarr[1].split(",");
				int arrSize=inputnum.length;
				Integer[] arrnum=new Integer[arrSize];
				
				for(int i=0;i<arrSize;i++) {
					arrnum[i]=Integer.parseInt(inputnum[i]);
				}
				if(inputarr[0].equalsIgnoreCase("Info")) {
					for(int i=0;i<arrSize;i++) {
						chara.get(arrnum[i]).getInfo();
					}
				}
				else if(inputarr[0].equalsIgnoreCase("Cook")) {
					for(int i=0;i<chara.size();i++) {
						if(chara.get(arrnum[i])instanceof Ichef)((Ichef) chara.get(arrnum[i])).Cook();
						else System.out.println(chara.get(arrnum[i]).getName()+" tidak bisa melakukan aksi");
					}
				}
				else if(inputarr[0].equalsIgnoreCase("Drive")) {
					for(int i=0;i<chara.size();i++) {
						if(chara.get(arrnum[i])instanceof Idriver)((Idriver) chara.get(arrnum[i])).Drive();
						else System.out.println(chara.get(arrnum[i]).getName()+" tidak bisa melakukan aksi");
					}
				}
				else if(inputarr[0].equalsIgnoreCase("Work")) {
					for(int i=0;i<chara.size();i++) {
						if(chara.get(arrnum[i])instanceof Iworker)((Iworker) chara.get(arrnum[i])).Work();
						else System.out.println(chara.get(arrnum[i]).getName()+" tidak bisa melakukan aksi");
					}
				}
				else if(inputarr[0].equalsIgnoreCase("Paint")) {
					for(int i=0;i<chara.size();i++) {
						if(chara.get(arrnum[i])instanceof Iartist)((Iartist) chara.get(arrnum[i])).Paint();
						else System.out.println(chara.get(arrnum[i]).getName()+" tidak bisa melakukan aksi");
					}
				}
				else System.out.println("maaf, "+inputnum+" tidak termasuk kedalam command yang terdaftar");
			} 
			catch (NumberFormatException e) {
				System.out.println("maaf, "+input+" tidak termasuk kedalam command yang terdaftar");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("");
			}
		}		
	}

	public static void main(String[] args) {
		new Main();

	}

}
