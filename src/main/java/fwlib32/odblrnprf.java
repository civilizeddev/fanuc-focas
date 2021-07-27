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
public class odblrnprf extends Structure {
	/** status */
	public byte status;
	/** comment */
	public byte[] comment = new byte[17];
	/** path */
	public byte path;
	public byte dummy1;
	public odblrnprf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("status", "comment", "path", "dummy1");
	}
	public odblrnprf(byte status, byte comment[], byte path, byte dummy1) {
		super();
		this.status = status;
		if ((comment.length != this.comment.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.comment = comment;
		this.path = path;
		this.dummy1 = dummy1;
	}
	public odblrnprf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odblrnprf implements Structure.ByReference {
		
	};
	public static class ByValue extends odblrnprf implements Structure.ByValue {
		
	};
}