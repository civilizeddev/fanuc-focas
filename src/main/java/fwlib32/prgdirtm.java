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
public class prgdirtm extends Structure {
	public NativeLong prg_no;
	public byte[] comment = new byte[51];
	public byte[] cuttime = new byte[13];
	public prgdirtm() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("prg_no", "comment", "cuttime");
	}
	public prgdirtm(NativeLong prg_no, byte comment[], byte cuttime[]) {
		super();
		this.prg_no = prg_no;
		if ((comment.length != this.comment.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.comment = comment;
		if ((cuttime.length != this.cuttime.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.cuttime = cuttime;
	}
	public prgdirtm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends prgdirtm implements Structure.ByReference {
		
	};
	public static class ByValue extends prgdirtm implements Structure.ByValue {
		
	};
}