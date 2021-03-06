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
public class odbpmmslv extends Structure {
	/** a number of groups */
	public NativeLong slvnum;
	/** group's number */
	public NativeLong[] group = new NativeLong[8];
	public odbpmmslv() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slvnum", "group");
	}
	public odbpmmslv(NativeLong slvnum, NativeLong group[]) {
		super();
		this.slvnum = slvnum;
		if ((group.length != this.group.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.group = group;
	}
	public odbpmmslv(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpmmslv implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpmmslv implements Structure.ByValue {
		
	};
}
