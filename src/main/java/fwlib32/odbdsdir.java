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
public class odbdsdir extends Structure {
	public NativeLong file_num;
	public NativeLong remainder;
	public short data_num;
	public fwlib32.iodbprm.data_struct[] data = new fwlib32.iodbprm.data_struct[32];
	public static class data_struct extends Structure {
		public byte[] file_name = new byte[16];
		public byte[] comment = new byte[64];
		public NativeLong size;
		public byte[] date = new byte[16];
		public data_struct() {
			super();
		}
		protected List<String> getFieldOrder() {
			return Arrays.asList("file_name", "comment", "size", "date");
		}
		public data_struct(byte file_name[], byte comment[], NativeLong size, byte date[]) {
			super();
			if ((file_name.length != this.file_name.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.file_name = file_name;
			if ((comment.length != this.comment.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.comment = comment;
			this.size = size;
			if ((date.length != this.date.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.date = date;
		}
		public data_struct(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends data_struct implements Structure.ByReference {
			
		};
		public static class ByValue extends data_struct implements Structure.ByValue {
			
		};
	};
	public odbdsdir() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("file_num", "remainder", "data_num", "data");
	}
	public odbdsdir(NativeLong file_num, NativeLong remainder, short data_num, fwlib32.iodbprm.data_struct data[]) {
		super();
		this.file_num = file_num;
		this.remainder = remainder;
		this.data_num = data_num;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public odbdsdir(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbdsdir implements Structure.ByReference {
		
	};
	public static class ByValue extends odbdsdir implements Structure.ByValue {
		
	};
}