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
public class odbsvfback extends Structure {
	public short dummy;
	public short dtype;
	public NativeLong[] fback = new NativeLong[32];
	public NativeLong[] afback = new NativeLong[32];
	public odbsvfback() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dummy", "dtype", "fback", "afback");
	}
	public odbsvfback(short dummy, short dtype, NativeLong fback[], NativeLong afback[]) {
		super();
		this.dummy = dummy;
		this.dtype = dtype;
		if ((fback.length != this.fback.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.fback = fback;
		if ((afback.length != this.afback.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.afback = afback;
	}
	public odbsvfback(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsvfback implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsvfback implements Structure.ByValue {
		
	};
}
