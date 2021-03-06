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
public class odbtpnlinf extends Structure {
	public byte status;
	public byte[] dummy = new byte[3];
	public short coord_x;
	public short coord_y;
	public odbtpnlinf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("status", "dummy", "coord_x", "coord_y");
	}
	public odbtpnlinf(byte status, byte dummy[], short coord_x, short coord_y) {
		super();
		this.status = status;
		if ((dummy.length != this.dummy.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy = dummy;
		this.coord_x = coord_x;
		this.coord_y = coord_y;
	}
	public odbtpnlinf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbtpnlinf implements Structure.ByReference {
		
	};
	public static class ByValue extends odbtpnlinf implements Structure.ByValue {
		
	};
}
