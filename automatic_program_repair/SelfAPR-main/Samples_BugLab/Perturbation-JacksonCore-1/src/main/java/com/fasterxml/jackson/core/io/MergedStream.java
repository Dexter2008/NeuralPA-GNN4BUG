[BugLab_Variable_Misuse]^_context = _context;^29^^^^^26^34^_context = context;^[CLASS] MergedStream  [METHOD] <init> [RETURN_TYPE] InputStream,byte[],int,int)   IOContext context InputStream in byte[] buf int start int end [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^_in = _in;^30^^^^^26^34^_in = in;^[CLASS] MergedStream  [METHOD] <init> [RETURN_TYPE] InputStream,byte[],int,int)   IOContext context InputStream in byte[] buf int start int end [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^_buffer = _buffer;^31^^^^^26^34^_buffer = buf;^[CLASS] MergedStream  [METHOD] <init> [RETURN_TYPE] InputStream,byte[],int,int)   IOContext context InputStream in byte[] buf int start int end [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^_end = start;^33^^^^^26^34^_end = end;^[CLASS] MergedStream  [METHOD] <init> [RETURN_TYPE] InputStream,byte[],int,int)   IOContext context InputStream in byte[] buf int start int end [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^if  ( buf != null )  {^39^^^^^37^43^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Wrong_Operator]^if  ( _buffer == null )  {^39^^^^^37^43^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^return start - _ptr;^40^^^^^37^43^return _end - _ptr;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^return _end - start;^40^^^^^37^43^return _end - _ptr;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Argument_Swapping]^return _ptr - _end;^40^^^^^37^43^return _end - _ptr;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Wrong_Operator]^return _end  >  _ptr;^40^^^^^37^43^return _end - _ptr;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Wrong_Operator]^return _end  >=  _ptr;^40^^^^^37^43^return _end - _ptr;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Variable_Misuse]^return in.available (  ) ;^42^^^^^37^43^return _in.available (  ) ;^[CLASS] MergedStream  [METHOD] available [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  start  
[BugLab_Wrong_Operator]^if  ( _buffer != null )  {^55^^^^^53^58^if  ( _buffer == null )  {^[CLASS] MergedStream  [METHOD] mark [RETURN_TYPE] void   int readlimit [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Variable_Misuse]^_in.mark ( start ) ;^56^^^^^53^58^_in.mark ( readlimit ) ;^[CLASS] MergedStream  [METHOD] mark [RETURN_TYPE] void   int readlimit [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Variable_Misuse]^_in.mark ( end ) ;^56^^^^^53^58^_in.mark ( readlimit ) ;^[CLASS] MergedStream  [METHOD] mark [RETURN_TYPE] void   int readlimit [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Variable_Misuse]^return  ( _buffer == null )  && in.markSupported (  ) ;^64^^^^^61^65^return  ( _buffer == null )  && _in.markSupported (  ) ;^[CLASS] MergedStream  [METHOD] markSupported [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Argument_Swapping]^return  ( _in == null )  && _buffer.markSupported (  ) ;^64^^^^^61^65^return  ( _buffer == null )  && _in.markSupported (  ) ;^[CLASS] MergedStream  [METHOD] markSupported [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Wrong_Operator]^return  ( _buffer == null )  || _in.markSupported (  ) ;^64^^^^^61^65^return  ( _buffer == null )  && _in.markSupported (  ) ;^[CLASS] MergedStream  [METHOD] markSupported [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Wrong_Operator]^return  ( _buffer != null )  && _in.markSupported (  ) ;^64^^^^^61^65^return  ( _buffer == null )  && _in.markSupported (  ) ;^[CLASS] MergedStream  [METHOD] markSupported [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  end  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _buffer == null )  {^70^^^^^68^78^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^if  ( start >= _end )  {^72^^^^^68^78^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^if  ( _ptr >= start )  {^72^^^^^68^78^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Argument_Swapping]^if  ( _end >= _ptr )  {^72^^^^^68^78^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _ptr > _end )  {^72^^^^^68^78^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^return start;^75^^^^^68^78^return c;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^int c = buf[_ptr++] & 0xFF;^71^^^^^68^78^int c = _buffer[_ptr++] & 0xFF;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Wrong_Operator]^int c = _buffer[_ptr++]  <<  0xFF;^71^^^^^68^78^int c = _buffer[_ptr++] & 0xFF;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _ptr == _end )  {^72^^^^^68^78^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Wrong_Operator]^int c = _buffer[_ptr++]  >>  0xFF;^71^^^^^68^78^int c = _buffer[_ptr++] & 0xFF;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^return in.read (  ) ;^77^^^^^68^78^return _in.read (  ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   [VARIABLES] byte[]  _buffer  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^return read ( buf, 0, b.length ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^return read ( b, 0, start ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Argument_Swapping]^return read ( b.length, 0, b ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Wrong_Literal]^return read ( b, _end, b.length ) ;^83^^^^^81^84^return read ( b, 0, b.length ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  c  end  readlimit  start  
[BugLab_Variable_Misuse]^if  ( buf != null )  {^89^^^^^87^102^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _buffer == null )  {^89^^^^^87^102^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( start > avail )  {^91^^^^^87^102^if  ( len > avail )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^if  ( avail > len )  {^91^^^^^87^102^if  ( len > avail )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^if  ( len >= avail )  {^91^^^^^87^102^if  ( len > avail )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( start >= _end )  {^96^^^^^87^102^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^if  ( _end >= _ptr )  {^96^^^^^87^102^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _ptr > _end )  {^96^^^^^87^102^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^len = len;^92^^^^^87^102^len = avail;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^_ptr += start;^95^^^^^87^102^_ptr += len;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return start;^99^^^^^87^102^return len;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^int avail = start - _ptr;^90^^^^^87^102^int avail = _end - _ptr;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^int avail = _end - readlimit;^90^^^^^87^102^int avail = _end - _ptr;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^int avail = _ptr - _end;^90^^^^^87^102^int avail = _end - _ptr;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^int avail = _end  !=  _ptr;^90^^^^^87^102^int avail = _end - _ptr;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^System.arraycopy ( _buffer, _ptr, buf, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^System.arraycopy ( _buffer, _ptr, b, readlimit, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^System.arraycopy ( _buffer, _ptr, b, off, readlimit ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^System.arraycopy ( _buffer, start, b, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^System.arraycopy ( b, _ptr, _buffer, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^System.arraycopy ( _buffer, _ptr, b, len, off ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^System.arraycopy ( len, _ptr, b, off, _buffer ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^System.arraycopy ( _buffer, b, _ptr, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( len > off )  {^91^^^^^87^102^if  ( len > avail )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^len = readlimit;^92^^^^^87^102^len = avail;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( readlimit >= _end )  {^96^^^^^87^102^if  ( _ptr >= _end )  {^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^_ptr += end;^95^^^^^87^102^_ptr += len;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return off;^99^^^^^87^102^return len;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^int avail = _end   instanceof   _ptr;^90^^^^^87^102^int avail = _end - _ptr;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^System.arraycopy ( _buffer, _ptr, b, start, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^System.arraycopy ( _buffer, len, b, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^System.arraycopy ( _buffer, off, b, _ptr, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^System.arraycopy ( _ptr, _buffer, b, off, len ) ;^94^^^^^87^102^System.arraycopy ( _buffer, _ptr, b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return _in.read ( buf, off, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return _in.read ( b, start, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return _in.read ( b, off, end ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return in.read ( b, off, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^return _in.read ( off, b, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^return _in.read ( b, len, off ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^return b.read ( _in, off, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return _in.read ( b, end, len ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^return _in.read ( b, off, start ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Argument_Swapping]^return _in.read ( len, off, b ) ;^101^^^^^87^102^return _in.read ( b, off, len ) ;^[CLASS] MergedStream  [METHOD] read [RETURN_TYPE] int   byte[] b int off int len [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( buf == null )  {^107^^^^^105^110^if  ( _buffer == null )  {^[CLASS] MergedStream  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _buffer != null )  {^107^^^^^105^110^if  ( _buffer == null )  {^[CLASS] MergedStream  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( _buffer != countull )  {^117^^^^^113^133^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^if  ( buf != null )  {^117^^^^^113^133^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^if  ( _buffer == null )  {^117^^^^^113^133^if  ( _buffer != null )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^if  ( readlimit > n )  {^120^^^^^113^133^if  ( amount > n )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^if  ( amount > count )  {^120^^^^^113^133^if  ( amount > n )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^if  ( amount < n )  {^120^^^^^113^133^if  ( amount > n )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^return count;^122^^^^^113^133^return n;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^count += start;^125^^^^^113^133^count += amount;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^n -= len;^126^^^^^113^133^n -= amount;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^n += amount;^126^^^^^113^133^n -= amount;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^int amount = start - _ptr;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^int amount = _end - readlimit;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Argument_Swapping]^int amount = _ptr - _end;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^int amount = _end  |  _ptr;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^if  ( len > n )  {^120^^^^^113^133^if  ( amount > n )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Argument_Swapping]^if  ( n > amount )  {^120^^^^^113^133^if  ( amount > n )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^if  ( amount == n )  {^120^^^^^113^133^if  ( amount > n )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^count += off;^125^^^^^113^133^count += amount;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^n -= start;^126^^^^^113^133^n -= amount;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^int amount = off - _ptr;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^int amount = _end - off;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^int amount = _end  ^  _ptr;^118^^^^^113^133^int amount = _end - _ptr;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^if  ( count > 0 )  {^129^^^^^113^133^if  ( n > 0 )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Operator]^if  ( n == 0 )  {^129^^^^^113^133^if  ( n > 0 )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Wrong_Literal]^if  ( n > end )  {^129^^^^^113^133^if  ( n > 0 )  {^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^count += _in.skip ( count ) ;^130^^^^^113^133^count += _in.skip ( n ) ;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^count += in.skip ( n ) ;^130^^^^^113^133^count += _in.skip ( n ) ;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Argument_Swapping]^count += n.skip ( _in ) ;^130^^^^^113^133^count += _in.skip ( n ) ;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^return n;^132^^^^^113^133^return count;^[CLASS] MergedStream  [METHOD] skip [RETURN_TYPE] long   long n [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  long  count  n  
[BugLab_Variable_Misuse]^byte[] buf = b;^137^^^^^135^144^byte[] buf = _buffer;^[CLASS] MergedStream  [METHOD] freeMergedBuffer [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^if  ( buf == null )  {^138^^^^^135^144^if  ( buf != null )  {^[CLASS] MergedStream  [METHOD] freeMergedBuffer [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^if  ( context != null )  {^140^^^^^135^144^if  ( _context != null )  {^[CLASS] MergedStream  [METHOD] freeMergedBuffer [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  
[BugLab_Wrong_Operator]^if  ( _context == null )  {^140^^^^^135^144^if  ( _context != null )  {^[CLASS] MergedStream  [METHOD] freeMergedBuffer [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  
[BugLab_Variable_Misuse]^_context.releaseReadIOBuffer ( b ) ;^141^^^^^135^144^_context.releaseReadIOBuffer ( buf ) ;^[CLASS] MergedStream  [METHOD] freeMergedBuffer [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  b  buf  IOContext  _context  context  boolean  InputStream  _in  in  int  _end  _ptr  amount  avail  c  end  len  off  readlimit  start  