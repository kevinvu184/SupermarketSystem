package business;

/*
 * Class:			Staff
 * Author:			[VuDuyAnhKhoa] - [s3678490]
 */

public class Staff {
	protected final String name;
	protected final String id;
	protected final int securityPin;

	public Staff(String name, String id, int securityPin) {
		this.name = name;
		this.id = id;
		this.securityPin = securityPin;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getSecurityPin() {
		return securityPin;
	}

	public String toString(String name, String id, int securityPin) {
		return "Name  :" + name + "\nID  :" + id + "\nSecurity Pin :" + securityPin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Staff))
			return false;
		Staff other = (Staff) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}