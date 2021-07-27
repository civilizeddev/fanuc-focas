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
public class tlmngtlgeom extends Structure {
	public byte l_pot_num;
	public byte r_pot_num;
	public byte u_pot_num;
	public byte d_pot_num;
	public byte tl_geom_num;
	public tlmngtlgeom() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("l_pot_num", "r_pot_num", "u_pot_num", "d_pot_num", "tl_geom_num");
	}
	public tlmngtlgeom(byte l_pot_num, byte r_pot_num, byte u_pot_num, byte d_pot_num, byte tl_geom_num) {
		super();
		this.l_pot_num = l_pot_num;
		this.r_pot_num = r_pot_num;
		this.u_pot_num = u_pot_num;
		this.d_pot_num = d_pot_num;
		this.tl_geom_num = tl_geom_num;
	}
	public tlmngtlgeom(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tlmngtlgeom implements Structure.ByReference {
		
	};
	public static class ByValue extends tlmngtlgeom implements Structure.ByValue {
		
	};
}
