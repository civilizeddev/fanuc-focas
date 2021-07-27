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
public class iodbrtmior extends Structure {
	/** kind of DI/DO variable address(alphabet) */
	public short adr_type;
	/** PMC address attribute (use for cnc_getrtmioinfo only) */
	public NativeLong adr_attr;
	/** DI/DO variable access enable start no. */
	public NativeLong sno;
	/** DI/DI variable access enable end no. */
	public NativeLong eno;
	public iodbrtmior() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("adr_type", "adr_attr", "sno", "eno");
	}
	public iodbrtmior(short adr_type, NativeLong adr_attr, NativeLong sno, NativeLong eno) {
		super();
		this.adr_type = adr_type;
		this.adr_attr = adr_attr;
		this.sno = sno;
		this.eno = eno;
	}
	public iodbrtmior(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbrtmior implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbrtmior implements Structure.ByValue {
		
	};
}