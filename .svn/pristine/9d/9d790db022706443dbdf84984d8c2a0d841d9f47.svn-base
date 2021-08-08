//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Semester 1
// Year: 2020
// Practical Number: 04
// Program to implement Tower of Hanoi
//===================================

import java.util.*;
public class HanoiTower{
	private int noDisk;
	private String src = "Pole1";
	private String dest = "Pole2";
	private String aux = "Pole3";

	// setting default number of disk to 3
	public HanoiTower(){
		this.noDisk = 3;
		solve(this.noDisk, this.src, this.dest,this.aux);
	}

	// setting the number of disk to user passed value
	public HanoiTower(int dTmp){
		this.noDisk = dTmp;
		solve(this.noDisk, this.src, this.dest,this.aux);
	}

	// solve function is to move the disks from one pole to another and to print the moves
	public void solve(int noDisk, String src, String dest, String aux){
		if(noDisk == 1) // base condition
			{
				System.out.print("Move the disk " + noDisk + " from " + src + " to " + dest+"\n");
			}
		else
			{	// transfering number of disks -1 from source to destination (here auxillary pole is the destination pole), using auxillary(here destination pole is the auxillary pole)
				solve(noDisk-1, src , aux , dest);
				// moving the last disk from source to destination pole
				System.out.print("Move the disk " + noDisk + " from " + src + " to " + dest+"\n");
				// transfering number of disks -1 from source (here auxillary is the source pole ) to destination , using source(here source pole is the auxillary pole)
				solve(noDisk-1, aux , dest , src);
			}
	}
}

