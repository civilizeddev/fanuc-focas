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
public class prgdir2o8 extends Structure {
	public NativeLong number;
	public NativeLong length;
	public byte[] comment = new byte[51];
	public byte dummy;
	public prgdir2o8() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("number", "length", "comment", "dummy");
	}
	public prgdir2o8(NativeLong number, NativeLong length, byte comment[], byte dummy) {
		super();
		this.number = number;
		this.length = length;
		if ((comment.length != this.comment.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.comment = comment;
		this.dummy = dummy;
	}
	public prgdir2o8(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends prgdir2o8 implements Structure.ByReference {
		
	};
	public static class ByValue extends prgdir2o8 implements Structure.ByValue {
		
	};
}
