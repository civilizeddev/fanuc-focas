package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbdgn extends Structure {
	/** data number */
	public short datano;
	/** axis number */
	public short type;
	public u_union u;
	public static class u_union extends Union {
		/** diagnosis data */
		public byte cdata;
		public short idata;
		public NativeLong ldata;
		public realdgn rdata;
		public byte[] cdatas = new byte[32];
		public short[] idatas = new short[32];
		public NativeLong[] ldatas = new NativeLong[32];
		public realdgn[] rdatas = new realdgn[32];
		public u_union() {
			super();
		}
		public u_union(byte cdata) {
			super();
			this.cdata = cdata;
			setType(Byte.TYPE);
		}
		public u_union(short idata) {
			super();
			this.idata = idata;
			setType(Short.TYPE);
		}
		public u_union(NativeLong ldata) {
			super();
			this.ldata = ldata;
			setType(NativeLong.class);
		}
		public u_union(realdgn rdata) {
			super();
			this.rdata = rdata;
			setType(realdgn.class);
		}
		public u_union(byte cdatas[]) {
			super();
			if ((cdatas.length != this.cdatas.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.cdatas = cdatas;
			setType(byte[].class);
		}
		public u_union(short idatas[]) {
			super();
			if ((idatas.length != this.idatas.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.idatas = idatas;
			setType(short[].class);
		}
		public u_union(NativeLong ldatas[]) {
			super();
			if ((ldatas.length != this.ldatas.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.ldatas = ldatas;
			setType(NativeLong[].class);
		}
		public u_union(realdgn rdatas[]) {
			super();
			if ((rdatas.length != this.rdatas.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.rdatas = rdatas;
			setType(realdgn[].class);
		}
		public u_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends u_union implements Structure.ByReference {
			
		};
		public static class ByValue extends u_union implements Structure.ByValue {
			
		};
	};
	public odbdgn() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("datano", "type", "u");
	}
	public odbdgn(short datano, short type, u_union u) {
		super();
		this.datano = datano;
		this.type = type;
		this.u = u;
	}
	public odbdgn(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbdgn implements Structure.ByReference {
		
	};
	public static class ByValue extends odbdgn implements Structure.ByValue {
		
	};
}
