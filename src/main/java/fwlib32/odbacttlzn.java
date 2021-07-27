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
public class odbacttlzn extends Structure {
	public short act_no;
	public NativeLong[] data = new NativeLong[2];
	public odbacttlzn() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("act_no", "data");
	}
	public odbacttlzn(short act_no, NativeLong data[]) {
		super();
		this.act_no = act_no;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public odbacttlzn(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbacttlzn implements Structure.ByReference {
		
	};
	public static class ByValue extends odbacttlzn implements Structure.ByValue {
		
	};
}
