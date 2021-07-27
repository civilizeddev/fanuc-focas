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
public class ODBHDDINF extends Structure {
	public NativeLong file_num;
	public NativeLong remainder_l;
	public NativeLong remainder_h;
	public byte[] current_dir = new byte[32];
	public ODBHDDINF() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("file_num", "remainder_l", "remainder_h", "current_dir");
	}
	public ODBHDDINF(NativeLong file_num, NativeLong remainder_l, NativeLong remainder_h, byte current_dir[]) {
		super();
		this.file_num = file_num;
		this.remainder_l = remainder_l;
		this.remainder_h = remainder_h;
		if ((current_dir.length != this.current_dir.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.current_dir = current_dir;
	}
	public ODBHDDINF(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ODBHDDINF implements Structure.ByReference {
		
	};
	public static class ByValue extends ODBHDDINF implements Structure.ByValue {
		
	};
}
