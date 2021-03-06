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
public class odbscl extends Structure {
	public short mode;
	public NativeLong[] center = new NativeLong[32];
	public NativeLong[] magnif = new NativeLong[32];
	public odbscl() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("mode", "center", "magnif");
	}
	public odbscl(short mode, NativeLong center[], NativeLong magnif[]) {
		super();
		this.mode = mode;
		if ((center.length != this.center.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.center = center;
		if ((magnif.length != this.magnif.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.magnif = magnif;
	}
	public odbscl(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbscl implements Structure.ByReference {
		
	};
	public static class ByValue extends odbscl implements Structure.ByValue {
		
	};
}
