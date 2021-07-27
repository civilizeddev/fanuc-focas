package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbaxis64 extends Structure {
	/** dummy1 */
	public short dummy1;
	/** axis number */
	public short type;
	/** dummy2 */
	public short[] dummy2 = new short[2];
	/** data value */
	public realdata[] data = new realdata[32];
	public odbaxis64() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("dummy1", "type", "dummy2", "data");
	}
	public odbaxis64(short dummy1, short type, short dummy2[], realdata data[]) {
		super();
		this.dummy1 = dummy1;
		this.type = type;
		if ((dummy2.length != this.dummy2.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy2 = dummy2;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public odbaxis64(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbaxis64 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbaxis64 implements Structure.ByValue {
		
	};
}
