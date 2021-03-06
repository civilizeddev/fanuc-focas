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
public class IODBDIDO extends Structure {
	public short slave_no;
	public short slot_no;
	public byte di_size;
	public byte di_type;
	public short di_addr;
	public byte do_size;
	public byte do_type;
	public short do_addr;
	public short shift;
	public byte module_dlen;
	public byte[] module_data = new byte[128];
	public IODBDIDO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slave_no", "slot_no", "di_size", "di_type", "di_addr", "do_size", "do_type", "do_addr", "shift", "module_dlen", "module_data");
	}
	public IODBDIDO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IODBDIDO implements Structure.ByReference {
		
	};
	public static class ByValue extends IODBDIDO implements Structure.ByValue {
		
	};
}
