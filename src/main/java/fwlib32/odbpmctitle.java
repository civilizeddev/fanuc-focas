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
public class odbpmctitle extends Structure {
	public byte[] mtb = new byte[48];
	public byte[] machine = new byte[48];
	public byte[] type = new byte[48];
	public byte[] prgno = new byte[8];
	public byte[] prgvers = new byte[4];
	public byte[] prgdraw = new byte[48];
	public byte[] date = new byte[32];
	public byte[] design = new byte[48];
	public byte[] written = new byte[48];
	public byte[] remarks = new byte[48];
	public odbpmctitle() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("mtb", "machine", "type", "prgno", "prgvers", "prgdraw", "date", "design", "written", "remarks");
	}
	public odbpmctitle(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpmctitle implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpmctitle implements Structure.ByValue {
		
	};
}
