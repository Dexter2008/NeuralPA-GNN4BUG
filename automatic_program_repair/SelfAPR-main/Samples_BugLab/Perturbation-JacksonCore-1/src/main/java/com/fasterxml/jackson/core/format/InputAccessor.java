[BugLab_Variable_Misuse]^_in = _in;^66^^^^^64^71^_in = in;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputStream,byte[])   InputStream in byte[] buffer [VARIABLES] byte[]  _buffer  buffer  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Variable_Misuse]^_buffer = _buffer;^67^^^^^64^71^_buffer = buffer;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputStream,byte[])   InputStream in byte[] buffer [VARIABLES] byte[]  _buffer  buffer  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Wrong_Literal]^_ptr = -1;^69^^^^^64^71^_ptr = 0;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputStream,byte[])   InputStream in byte[] buffer [VARIABLES] byte[]  _buffer  buffer  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Wrong_Literal]^_bufferedEnd = _bufferedEnd;^70^^^^^64^71^_bufferedEnd = 0;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputStream,byte[])   InputStream in byte[] buffer [VARIABLES] byte[]  _buffer  buffer  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Variable_Misuse]^_buffer = buffer;^80^^^^^77^84^_buffer = inputDocument;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[])   byte[] inputDocument [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Wrong_Literal]^_bufferedStart = ;^82^^^^^77^84^_bufferedStart = 0;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[])   byte[] inputDocument [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Variable_Misuse]^_bufferedEnd = buffer.length;^83^^^^^77^84^_bufferedEnd = inputDocument.length;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[])   byte[] inputDocument [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Variable_Misuse]^_bufferedEnd = _ptr;^83^^^^^77^84^_bufferedEnd = inputDocument.length;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[])   byte[] inputDocument [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Argument_Swapping]^_bufferedEnd = inputDocument.length.length;^83^^^^^77^84^_bufferedEnd = inputDocument.length;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[])   byte[] inputDocument [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Argument_Swapping]^_bufferedEnd = inputDocument;^83^^^^^77^84^_bufferedEnd = inputDocument.length;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[])   byte[] inputDocument [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  
[BugLab_Variable_Misuse]^_buffer = buffer;^95^^^^^92^99^_buffer = inputDocument;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[],int,int)   byte[] inputDocument int start int len [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  len  start  
[BugLab_Variable_Misuse]^_ptr = _ptr;^96^^^^^92^99^_ptr = start;^[CLASS] Std  [METHOD] <init> [RETURN_TYPE] InputAccessor$Std(byte[],int,int)   byte[] inputDocument int start int len [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  len  start  
[BugLab_Variable_Misuse]^if  ( start < _bufferedEnd )  {^104^^^^^102^120^if  ( _ptr < _bufferedEnd )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^if  ( _ptr < start )  {^104^^^^^102^120^if  ( _ptr < _bufferedEnd )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^if  ( _bufferedEnd < _ptr )  {^104^^^^^102^120^if  ( _ptr < _bufferedEnd )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^if  ( _ptr > _bufferedEnd )  {^104^^^^^102^120^if  ( _ptr < _bufferedEnd )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Literal]^return false;^105^^^^^102^120^return true;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^if  ( in == null )  {^107^^^^^102^120^if  ( _in == null )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^if  ( _in != null )  {^107^^^^^102^120^if  ( _in == null )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Literal]^return true;^108^^^^^102^120^return false;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int amount = count - _ptr;^110^^^^^102^120^int amount = _buffer.length - _ptr;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int amount = inputDocument.length - _ptr;^110^^^^^102^120^int amount = _buffer.length - _ptr;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int amount = _buffer.length - start;^110^^^^^102^120^int amount = _buffer.length - _ptr;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int amount = _ptr - _buffer.length;^110^^^^^102^120^int amount = _buffer.length - _ptr;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int amount = _buffer.length.length - _ptr;^110^^^^^102^120^int amount = _buffer.length - _ptr;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^int amount = _buffer.length  >>  _ptr;^110^^^^^102^120^int amount = _buffer.length - _ptr;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^if  ( amount <= 1 )  {^111^^^^^102^120^if  ( amount < 1 )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Literal]^if  ( amount < 2 )  {^111^^^^^102^120^if  ( amount < 1 )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Literal]^return true;^112^^^^^102^120^return false;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int count = _in.read ( _buffer, _ptr, len ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int count = _in.read ( inputDocument, _ptr, amount ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int count = _in.read ( _buffer, start, amount ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int count = _in.read ( amount, _ptr, _buffer ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int count = amount.read ( _buffer, _ptr, _in ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int count = _in.read ( _ptr, _buffer, amount ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int count = _in.read ( _buffer, amount, _ptr ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int count = _in.read ( _buffer, _ptr, start ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int count = in.read ( _buffer, _ptr, amount ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^int count = _in.read ( _buffer, len, amount ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^int count = _buffer.read ( _in, _ptr, amount ) ;^114^^^^^102^120^int count = _in.read ( _buffer, _ptr, amount ) ;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^if  ( start <= 0 )  {^115^^^^^102^120^if  ( count <= 0 )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^if  ( count < 0 )  {^115^^^^^102^120^if  ( count <= 0 )  {^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Literal]^return true;^116^^^^^102^120^return false;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^_bufferedEnd += start;^118^^^^^102^120^_bufferedEnd += count;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Literal]^return false;^119^^^^^102^120^return true;^[CLASS] Std  [METHOD] hasMoreBytes [RETURN_TYPE] boolean   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^if  ( len >= _bufferedEnd )  {^126^^^^^123^132^if  ( _ptr >= _bufferedEnd )  {^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^if  ( _ptr >= start )  {^126^^^^^123^132^if  ( _ptr >= _bufferedEnd )  {^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^if  ( _ptr >= inputDocumentedEnd )  {^126^^^^^123^132^if  ( _ptr >= _bufferedEnd )  {^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^if  ( _buffer >= _ptredEnd )  {^126^^^^^123^132^if  ( _ptr >= _bufferedEnd )  {^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^if  ( _ptr >= _bufferedEndedEnd )  {^126^^^^^123^132^if  ( _ptr >= _bufferedEnd )  {^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^if  ( _ptr > _bufferedEnd )  {^126^^^^^123^132^if  ( _ptr >= _bufferedEnd )  {^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return inputDocument[_ptr++];^131^^^^^123^132^return _buffer[_ptr++];^[CLASS] Std  [METHOD] nextByte [RETURN_TYPE] byte   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^_ptr = len;^136^^^^^135^137^_ptr = _bufferedStart;^[CLASS] Std  [METHOD] reset [RETURN_TYPE] void   [VARIABLES] byte[]  _buffer  buffer  inputDocument  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return new DataFormatMatcher ( in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return new DataFormatMatcher ( _in, inputDocument, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return new DataFormatMatcher ( _in, _buffer, start,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( start - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _in, _buffer, match,  ( _bufferedEnd - _bufferedStart ) , _bufferedStart, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _in, _buffer, matchStrength,  ( _bufferedEnd - _bufferedStart ) , match, _bufferedStart ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _buffer, _in, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _in, matchStrength, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, _buffer ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _in, _buffer, _bufferedEnd,  ( _bufferedStart - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd  ||  _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return new DataFormatMatcher ( _in, _buffer, len,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Variable_Misuse]^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( len - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( match - _bufferedStart ) , _bufferedEnd, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( matchStrength - _bufferedStart ) , match, _bufferedEnd ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Argument_Swapping]^return new DataFormatMatcher ( _bufferedStart, _buffer, _in,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  
[BugLab_Wrong_Operator]^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd  <<  _bufferedStart ) , match, matchStrength ) ;^147^148^^^^145^149^return new DataFormatMatcher ( _in, _buffer, _bufferedStart,  ( _bufferedEnd - _bufferedStart ) , match, matchStrength ) ;^[CLASS] Std  [METHOD] createMatcher [RETURN_TYPE] DataFormatMatcher   JsonFactory match MatchStrength matchStrength [VARIABLES] byte[]  _buffer  buffer  inputDocument  JsonFactory  match  MatchStrength  matchStrength  boolean  InputStream  _in  in  int  _bufferedEnd  _bufferedStart  _ptr  amount  count  len  start  