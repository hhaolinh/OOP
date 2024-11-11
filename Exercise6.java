package uk.ac.cam.hh645.OOP;
 

public class Exercise6{
	public static void main(String[] args) {
		
	}
}

class ListNode{
	int val;
	ListNode next;

	public ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
    public void show(){
    	ListNode cur = this;
		while (cur != null){
			System.out.print(cur.val);
			System.out.print(" ");
			cur = cur.next;
		}
		System.out.println();
    }
	public void append(int val){
		ListNode cur = this;
		while (cur.next != null){
			cur = cur.next;
		}
		cur.next = new ListNode(val, null);
	}
	public ListNode remove(int val){
		ListNode cur = this;
		if (this.val == val){
			return this.next;
		}
		while(cur.next != null){
			if (cur.next.val == val){
				cur.next = cur.next.next;
				return this;
			}
		}
		return this;
	}
	public int hd(){
		return this.val;
	}
	public int nth(int n){
		ListNode cur = this;
		while (cur != null){
			if (n == 0){
				return cur.val;
			}else{
				cur = cur.next;
				n -= 1;
			}
		}
		System.out.println("Index out of bound");
		return -1;
	}
	public int length(){
		ListNode cur = this;
		int leng = 0;
		while (cur != null) {
			cur = cur.next;
			leng += 1;
		}
		return leng;
	}
	public boolean isCycle(){
		ListNode slow = this;
		ListNode fast = this.next;
		while (slow != fast) {
			if (slow == null || fast == null || fast.next == null){
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}