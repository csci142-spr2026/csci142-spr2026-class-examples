package lock;

public class TestKeyLock {

	public static void main(String[] args) {
		
		KeyLock keylock1 = new KeyLock(1);
		// Test inserting wrong key
		System.out.println("Should be false, inserting wrong key:" + keylock1.insertKey(2));
		
		// Test inserting correct key
		System.out.println("Should be able to insert correct key, this is true: " + keylock1.insertKey(1));
		
		// Test inserting correct key AFTER the correct key is already inserted, so should fail
		System.out.println("Cannot insert key again, this is false: " + keylock1.insertKey(1));
		
		// If remove key, can you still lock it?  Should be able to.
		System.out.println("Unlock because keylock1 is locked: " + keylock1.unlock());
		System.out.println("Remove key which is in the lock: " + keylock1.removeKey());
		System.out.println("Should be able to lock the unlocked keylock1 even without key: " + keylock1.lock());

		/*
		 * MORE TESTS
		 */

	}

}
