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
public class in_dsfile extends Structure {
	/** path name */
	public byte[] path = new byte[256];
	/** file number */
	public NativeLong fnum;
	/** offset */
	public NativeLong offset;
	/** request file num */
	public short req_num;
	/** size type */
	public short size_type;
	/** comment type */
	public short detail;
	public short dummy;
	public in_dsfile() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("path", "fnum", "offset", "req_num", "size_type", "detail", "dummy");
	}
	public in_dsfile(byte path[], NativeLong fnum, NativeLong offset, short req_num, short size_type, short detail, short dummy) {
		super();
		if ((path.length != this.path.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.path = path;
		this.fnum = fnum;
		this.offset = offset;
		this.req_num = req_num;
		this.size_type = size_type;
		this.detail = detail;
		this.dummy = dummy;
	}
	public in_dsfile(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends in_dsfile implements Structure.ByReference {
		
	};
	public static class ByValue extends in_dsfile implements Structure.ByValue {
		
	};
}