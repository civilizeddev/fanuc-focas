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
public class idbrbgroup extends Structure {
	public byte robot_program;
	public byte[] nc_program_folder = new byte[213];
	public byte[] nc_program_name = new byte[33];
	public idbrbgroup() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("robot_program", "nc_program_folder", "nc_program_name");
	}
	public idbrbgroup(byte robot_program, byte nc_program_folder[], byte nc_program_name[]) {
		super();
		this.robot_program = robot_program;
		if ((nc_program_folder.length != this.nc_program_folder.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.nc_program_folder = nc_program_folder;
		if ((nc_program_name.length != this.nc_program_name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.nc_program_name = nc_program_name;
	}
	public idbrbgroup(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends idbrbgroup implements Structure.ByReference {
		
	};
	public static class ByValue extends idbrbgroup implements Structure.ByValue {
		
	};
}
