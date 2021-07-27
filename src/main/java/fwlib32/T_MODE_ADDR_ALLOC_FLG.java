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
public class T_MODE_ADDR_ALLOC_FLG extends Structure {
	public byte md_path;
	public byte md_kind;
	public byte md_top_address;
	public byte md_size;
	public T_MODE_ADDR_ALLOC_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("md_path", "md_kind", "md_top_address", "md_size");
	}
	public T_MODE_ADDR_ALLOC_FLG(byte md_path, byte md_kind, byte md_top_address, byte md_size) {
		super();
		this.md_path = md_path;
		this.md_kind = md_kind;
		this.md_top_address = md_top_address;
		this.md_size = md_size;
	}
	public T_MODE_ADDR_ALLOC_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_MODE_ADDR_ALLOC_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends T_MODE_ADDR_ALLOC_FLG implements Structure.ByValue {
		
	};
}
