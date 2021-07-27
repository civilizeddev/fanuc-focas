package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class iodbpmainte extends Structure {
	/** name */
	public byte[] name = new byte[62];
	/** life count type */
	public NativeLong type;
	/** total life time (minite basis) */
	public NativeLong total;
	/** life rest time */
	public NativeLong remain;
	/** life state */
	public NativeLong stat;
	public iodbpmainte() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("name", "type", "total", "remain", "stat");
	}
	public iodbpmainte(byte name[], NativeLong type, NativeLong total, NativeLong remain, NativeLong stat) {
		super();
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		this.type = type;
		this.total = total;
		this.remain = remain;
		this.stat = stat;
	}
	public iodbpmainte(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbpmainte implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbpmainte implements Structure.ByValue {
		
	};
}