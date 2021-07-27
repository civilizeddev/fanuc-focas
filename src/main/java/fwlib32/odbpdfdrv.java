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
public class odbpdfdrv extends Structure {
	/** maximum drive number */
	public short max_num;
	public short dummy;
	/** drive name */
	public byte[] drive = new byte[((16) * (12))];
	public odbpdfdrv() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("max_num", "dummy", "drive");
	}
	public odbpdfdrv(short max_num, short dummy, byte drive[]) {
		super();
		this.max_num = max_num;
		this.dummy = dummy;
		if ((drive.length != this.drive.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.drive = drive;
	}
	public odbpdfdrv(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpdfdrv implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpdfdrv implements Structure.ByValue {
		
	};
}
