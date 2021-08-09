//==================================
// Foundations of Computer Science
// Student: Chirag Mahendra Thakkar
// id: a1806400
// Semester: Sem01
// Year: 2020
// Program to get the details of the Club
//===================================

import java.util.*;
class Club{
	ArrayList<Player> members = new ArrayList<Player>() ;

	public void addMember(Player player){
		this.members.add(player);
	}

	boolean removeMemberById(int PId){
		boolean removed = false;

		for(int i =0; i < this.members.size(); i++){
			if(this.members.get(i).getId() == PId){
				this.members.remove(i);
				removed = true;
				return removed;
			}
		}
		return removed;
	}

	// method to get highest ranking
	public Player getHighestRankedPlayer(){
		// if there are no members
		if(this.members.size() == 0){
			return null;
		}
		else{
			int position = 0;
			int highestId = 0;
			for(int i = 0; i < this.members.size(); i++){
				if(this.members.get(i).getRanking() >= highestId){
					highestId = this.members.get(i).getRanking();
					position = i;
				}
		}

		return this.members.get(position);
		}
	}

	// method to print members
	public void printMembers(){
		for(int i = 0; i < this.members.size(); i++){
			String info = this.members.get(i).toString();
			System.out.println(info);
		}
	}
}