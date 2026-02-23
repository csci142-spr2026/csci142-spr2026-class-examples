package lock;

public class KeyLock implements Lock {
	private int key;
	private boolean isLocked;
	private boolean isInserted;
	
	public KeyLock(int key) {
		this.key = key;
		this.isLocked = true;
		this.isInserted = false;
	}
	
	public boolean insertKey(int key) {
		if (this.isInserted) {
			return false;
		}
		else if (this.key == key) {
			this.isInserted = true;
			return true;
		}
		return false;
	}
	
	public boolean removeKey() {
		if (isInserted) {
			isInserted = false;
			return true;
		}
		return false;
	}
	
	public boolean turn() {
		if (isInserted) {
			isLocked = false;
			return true;
		}
		return false;
	}

	@Override
	public boolean lock() {
		/*
		 * Here (!isLocked) is same as (isLocked == false) same as (isLocked != true)
		 */
		if (!isLocked) {
			isLocked = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean unlock() {
		if (isInserted && isLocked) {
			isLocked = false;
			return true;
		}
		return false;
	}

	@Override
	public boolean isLocked() {
		return isLocked;
	}

}
