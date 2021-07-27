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
public class OUT_FSINFO extends Structure {
	public short Number;
	public byte[] pad = new byte[2];
	public CLNT_INFO[] clntinfo = new CLNT_INFO[10];
	public OUT_FSINFO() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Number", "pad", "clntinfo");
	}
	public OUT_FSINFO(short Number, byte pad[], CLNT_INFO clntinfo[]) {
		super();
		this.Number = Number;
		if ((pad.length != this.pad.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad = pad;
		if ((clntinfo.length != this.clntinfo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.clntinfo = clntinfo;
	}
	public OUT_FSINFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_FSINFO implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_FSINFO implements Structure.ByValue {
		
	};
}
