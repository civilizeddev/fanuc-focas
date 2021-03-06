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
public class odbdsmnt extends Structure {
	public NativeLong empty_cnt;
	public NativeLong total_size;
	public NativeLong read_ptr;
	public NativeLong write_ptr;
	public odbdsmnt() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("empty_cnt", "total_size", "read_ptr", "write_ptr");
	}
	public odbdsmnt(NativeLong empty_cnt, NativeLong total_size, NativeLong read_ptr, NativeLong write_ptr) {
		super();
		this.empty_cnt = empty_cnt;
		this.total_size = total_size;
		this.read_ptr = read_ptr;
		this.write_ptr = write_ptr;
	}
	public odbdsmnt(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbdsmnt implements Structure.ByReference {
		
	};
	public static class ByValue extends odbdsmnt implements Structure.ByValue {
		
	};
}
