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
public class PNC_ADDRTOP extends Structure {
	public short Path;
	public short Kind;
	public NativeLong Addr;
	public PNC_ADDRTOP() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Path", "Kind", "Addr");
	}
	public PNC_ADDRTOP(short Path, short Kind, NativeLong Addr) {
		super();
		this.Path = Path;
		this.Kind = Kind;
		this.Addr = Addr;
	}
	public PNC_ADDRTOP(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PNC_ADDRTOP implements Structure.ByReference {
		
	};
	public static class ByValue extends PNC_ADDRTOP implements Structure.ByValue {
		
	};
}