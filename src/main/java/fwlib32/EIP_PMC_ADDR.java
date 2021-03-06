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
public class EIP_PMC_ADDR extends Structure {
	public short Path;
	public short Addr;
	public NativeLong No;
	public EIP_PMC_ADDR() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Path", "Addr", "No");
	}
	public EIP_PMC_ADDR(short Path, short Addr, NativeLong No) {
		super();
		this.Path = Path;
		this.Addr = Addr;
		this.No = No;
	}
	public EIP_PMC_ADDR(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EIP_PMC_ADDR implements Structure.ByReference {
		
	};
	public static class ByValue extends EIP_PMC_ADDR implements Structure.ByValue {
		
	};
}
