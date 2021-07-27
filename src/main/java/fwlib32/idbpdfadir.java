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
public class idbpdfadir extends Structure {
	/** path name */
	public byte[] path = new byte[212];
	/** entry number */
	public short req_num;
	/** kind of size */
	public short size_kind;
	/** kind of format */
	public short type;
	public short dummy;
	public idbpdfadir() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("path", "req_num", "size_kind", "type", "dummy");
	}
	public idbpdfadir(byte path[], short req_num, short size_kind, short type, short dummy) {
		super();
		if ((path.length != this.path.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.path = path;
		this.req_num = req_num;
		this.size_kind = size_kind;
		this.type = type;
		this.dummy = dummy;
	}
	public idbpdfadir(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends idbpdfadir implements Structure.ByReference {
		
	};
	public static class ByValue extends idbpdfadir implements Structure.ByValue {
		
	};
}
