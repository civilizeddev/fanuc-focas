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
public class iodbunsolic extends Structure {
	public byte[] ipaddr = new byte[16];
	public short port;
	public short reqaddr;
	public short pmcno;
	public short retry;
	public short timeout;
	public short alivetime;
	public short setno;
	public iodbunsolic.rddata_union[] rddata = new iodbunsolic.rddata_union[3];
	public static class rddata_union extends Union {
		public pmc_struct pmc;
		public dmy_struct dmy;
		public static class pmc_struct extends Structure {
			public short type;
			public short rdaddr;
			public short rdno;
			public short rdsize;
			public pmc_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("type", "rdaddr", "rdno", "rdsize");
			}
			public pmc_struct(short type, short rdaddr, short rdno, short rdsize) {
				super();
				this.type = type;
				this.rdaddr = rdaddr;
				this.rdno = rdno;
				this.rdsize = rdsize;
			}
			public pmc_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends pmc_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends pmc_struct implements Structure.ByValue {
				
			};
		};
		public static class dmy_struct extends Structure {
			public short type;
			public NativeLong dummy1;
			public short dummy2;
			public dmy_struct() {
				super();
			}
			protected List<String> getFieldOrder() {
				return Arrays.asList("type", "dummy1", "dummy2");
			}
			public dmy_struct(short type, NativeLong dummy1, short dummy2) {
				super();
				this.type = type;
				this.dummy1 = dummy1;
				this.dummy2 = dummy2;
			}
			public dmy_struct(Pointer peer) {
				super(peer);
			}
			public static class ByReference extends dmy_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends dmy_struct implements Structure.ByValue {
				
			};
		};
		public rddata_union() {
			super();
		}
		public rddata_union(pmc_struct pmc) {
			super();
			this.pmc = pmc;
			setType(pmc_struct.class);
		}
		public rddata_union(dmy_struct dmy) {
			super();
			this.dmy = dmy;
			setType(dmy_struct.class);
		}
		public rddata_union(Pointer peer) {
			super(peer);
		}
		public static class ByReference extends rddata_union implements Structure.ByReference {
			
		};
		public static class ByValue extends rddata_union implements Structure.ByValue {
			
		};
	};
	public iodbunsolic() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ipaddr", "port", "reqaddr", "pmcno", "retry", "timeout", "alivetime", "setno", "rddata");
	}
	public iodbunsolic(byte ipaddr[], short port, short reqaddr, short pmcno, short retry, short timeout, short alivetime, short setno, iodbunsolic.rddata_union rddata[]) {
		super();
		if ((ipaddr.length != this.ipaddr.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ipaddr = ipaddr;
		this.port = port;
		this.reqaddr = reqaddr;
		this.pmcno = pmcno;
		this.retry = retry;
		this.timeout = timeout;
		this.alivetime = alivetime;
		this.setno = setno;
		if ((rddata.length != this.rddata.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.rddata = rddata;
	}
	public iodbunsolic(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbunsolic implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbunsolic implements Structure.ByValue {
		
	};
}
