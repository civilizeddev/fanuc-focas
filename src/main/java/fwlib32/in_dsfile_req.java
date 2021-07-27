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
public class in_dsfile_req extends Structure {
	/** file name */
	public byte[] file = new byte[256];
	/** file number */
	public NativeLong fnum;
	/** offset */
	public NativeLong offset;
	/** comment type */
	public short detail;
	/** option */
	public short option;
	public in_dsfile_req() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("file", "fnum", "offset", "detail", "option");
	}
	public in_dsfile_req(byte file[], NativeLong fnum, NativeLong offset, short detail, short option) {
		super();
		if ((file.length != this.file.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.file = file;
		this.fnum = fnum;
		this.offset = offset;
		this.detail = detail;
		this.option = option;
	}
	public in_dsfile_req(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends in_dsfile_req implements Structure.ByReference {
		
	};
	public static class ByValue extends in_dsfile_req implements Structure.ByValue {
		
	};
}
