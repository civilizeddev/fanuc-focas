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
public class odbsp2_grp4 extends Structure {
	public odbmdgdt resistance;
	public byte detect_res;
	public byte[] reserved = new byte[7];
	public odbsp2_grp4() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("resistance", "detect_res", "reserved");
	}
	public odbsp2_grp4(odbmdgdt resistance, byte detect_res, byte reserved[]) {
		super();
		this.resistance = resistance;
		this.detect_res = detect_res;
		if ((reserved.length != this.reserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserved = reserved;
	}
	public odbsp2_grp4(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsp2_grp4 implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsp2_grp4 implements Structure.ByValue {
		
	};
}
