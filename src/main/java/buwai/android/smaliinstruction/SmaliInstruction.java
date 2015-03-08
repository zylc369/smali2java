package buwai.android.smaliinstruction;

import java.util.HashMap;
import java.util.Map;

public enum SmaliInstruction {
	
	MOVE (0x1, "move"), 
	MOVE_FROM_16 (0x2, "move/from16"), 
	MOVE_16 (0x3, "move/16"), 
	MOVE_WIDE (0x4, "move-wide"), 
	MOVE_WIDE_FROM_16 (0x5, "move-wide/from16"), 
	MOVE_WIDE_16 (0x6, "move-wide/16"), 
	MOVE_OBJECT (0x7, "move-object"), 
	MOVE_OBJECT_FROM_16 (0x8, "move-object/from16"), 
	MOVE_OBJECT_16 (0x9, "move-object/16"), 
	
	MOVE_RESULT (0xa, "move-result"), 
	MOVE_RESULT_WIDE (0xb, "move-result-wide"), 
	MOVE_RESULT_OBJECT (0xc, "move-result-object"), 
	
	MOVE_EXCEPTION (0xd, "move-exception"), 

	RETURN_VOID (0xe, "return-void"), 
	RETURN (0xf, "return"), 
	RETURN_WIDE (0x10, "return-wide"), 
	RETURN_OBJECT (0x11, "return-object"), 
	
	CONST_4 (0x12, "const/4"), 
	CONST_16 (0x13, "const/16"), 
	CONST (0x14, "const"), 
	CONST_HIGH_16 (0x15, "const/high16"), 
	CONST_WIDE_16 (0x16, "const-wide/16"), 
	CONST_WIDE_32 (0x17, "const-wide/32"), 
	CONST_WIDE (0x18, "const-wide"), 
	CONST_WIDE_HIGH_16 (0x19, "const-wide/high16"), 
	CONST_STRING (0x1a, "const-string"), 
	CONST_STRING_JUMBO (0x1b, "const-string/jumbo"), 
	
	CONST_CLASS (0x1c, "const-class"), 
	
	MONITOR_ENTER (0x1d, "monitor-enter"), 
	
	MONITOR_EXIT (0x1e, "monitor-exit"), 
	
	CHECK_CAST (0x1f, "check-cast"), 
	
	INSTANCE_OF (0x20, "instance-of"), 
	
	ARRAY_LENGTH (0x21, "array-length"), 
	
	NEW_INSTANCE (0x22, "new-instance"), 
	
	NEW_ARRAY (0x23, "new-array"), 
	
	FILLED_NEW_ARRAY (0x24, "filled-new-array"), 
	
	FILLED_NEW_ARRAY_RANGE (0x25, "filled-new-array/range"), 
	
	FILL_ARRAY_DATA (0x26, "fill-array-data"), 
	
	THROW (0x27, "throw"), 
	
	GOTO (0x28, "goto"), 
	GOTO_16 (0x29, "goto/16"), 
	GOTO_32 (0x2a, "goto/32"), 
	
	PACKED_SWITCH (0x2b, "packed-switch"), 
	
	SPARSE_SWITCH (0x2c, "sparse-switch"), 
	
	CMPL_FLOAT (0x2d, "cmpl-float"), 
	CMPG_FLOAT (0x2e, "cmpg-float"), 
	CMPL_DOUBLE (0x2f, "cmpl-double"), 
	CMPG_DOUBLE (0x30, "cmpg-double"), 
	CMP_LONG (0x31, "cmp-long"), 
	
	IF_EQ (0x32, "if-eq"), 
	IF_NE (0x33, "if-ne"), 
	IF_LT (0x34, "if-lt"), 
	IF_GE (0x35, "if-ge"), 
	IF_GT (0x36, "if-gt"), 
	IF_LE (0x37, "if-le"), 
	
	IF_EQZ (0x38, "if-eqz"), 
	IF_NEZ (0x39, "if-nez"), 
	IF_LTZ (0x3a, "if-ltz"), 
	IF_GEZ (0x3b, "if-gez"), 
	IF_GTZ (0x3c, "if-gtz"), 
	IF_LEZ (0x3d, "if-lez"), 
	
	AGET (0x44, "aget"), 
	AGET_WIDE (0x45, "aget-wide"), 
	AGET_OBJECT (0x46, "aget-object"), 
	AGET_BOOLEAN (0x47, "aget-boolean"), 
	AGET_BYTE (0x48, "aget-byte"), 
	AGET_CHAR (0x49, "aget-char"), 
	AGET_SHORT (0x4a, "aget-short"), 
	
	APUT (0x4b, "aput"), 
	APUT_WIDE (0x4c, "aput-wide"), 
	APUT_OBJECT (0x4d, "aput-object"), 
	APUT_BOOLEAN (0x4e, "aput-boolean"), 
	APUT_BYTE (0x4f, "aput-byte"), 
	APUT_CHAR (0x50, "aput-char"), 
	APUT_SHORT (0x51, "aput-short"), 
	
	IGET (0x52, "iget"), 
	IGET_WIDE (0x53, "iget-wide"), 
	IGET_OBJECT (0x54, "iget-object"), 
	IGET_BOOLEAN (0x55, "iget-boolean"), 
	IGET_BYTE (0x56, "iget-byte"), 
	IGET_CHAR (0x57, "iget-char"), 
	IGET_SHORT (0x58, "iget-short"), 
	
	IPUT (0x59, "iput"), 
	IPUT_WIDE (0x5a, "iput-wide"), 
	IPUT_OBJECT (0x5b, "iput-object"), 
	IPUT_BOOLEAN (0x5c, "iput-boolean"), 
	IPUT_BYTE (0x5d, "iput-byte"), 
	IPUT_CHAR (0x5e, "iput-char"), 
	IPUT_SHORT (0x5f, "iput-short"), 
	
	SGET (0x60, "sget"), 
	SGET_WIDE (0x61, "sget-wide"), 
	SGET_OBJECT (0x62, "sget-object"), 
	SGET_BOOLEAN (0x63, "sget-boolean"), 
	SGET_BYTE (0x64, "sget-byte"), 
	SGET_CHAR (0x65, "sget-char"), 
	SGET_SHORT (0x66, "sget-short"), 
	
	SPUT (0x67, "sput"), 
	SPUT_WIDE (0x68, "sput-wide"), 
	SPUT_OBJECT (0x69, "sput-object"), 
	SPUT_BOOLEAN (0x6a, "sput-boolean"), 
	SPUT_BYTE (0x6b, "sput-byte"), 
	SPUT_CHAR (0x6c, "sput-char"), 
	SPUT_SHORT (0x6d, "sput-short"), 
	
	INVOKE_VIRTUAL (0x6e, "invoke-virtual"), 
	INVOKE_SUPER (0x6f, "invoke-super"), 
	INVOKE_DIRECT (0x70, "invoke-direct"), 
	INVOKE_STATIC (0x71, "invoke-static"), 
	INVOKE_INTERFACE (0x72, "invoke-interface"), 
	
	INVOKE_VIRTUAL_RANGE (0x74, "invoke-virtual/range"), 
	INVOKE_SUPER_RANGE (0x75, "invoke-super/range"), 
	INVOKE_DIRECT_RANGE (0x76, "invoke-direct/range"), 
	INVOKE_STATIC_RANGE (0x77, "invoke-static/range"), 
	INVOKE_INTERFACE_RANGE (0x78, "invoke-interface/range"), 
	
	NEG_INT (0x7b, "neg-int"), 
	NOT_INT (0x7c, "not-int"), 
	NEG_LONG (0x7d, "neg-long"), 
	NOT_LONG (0x7e, "not-long"), 
	NEG_FLOAT (0x7f, "neg-float"), 
	NEG_DOUBLE (0x80, "neg-double"), 
	INT_TO_LONG (0x81, "int-to-long"), 
	INT_TO_FLOAT (0x82, "int-to-float"), 
	INT_TO_DOUBLE (0x83, "int-to-double"), 
	LONG_TO_INT (0x84, "long-to-int"), 
	LONG_TO_FLOAT (0x85, "long-to-float"), 
	LONG_TO_DOUBLE (0x86, "long-to-double"), 
	FLOAT_TO_INT (0x87, "float-to-int"), 
	FLOAT_TO_LONG (0x88, "float-to-long"), 
	FLOAT_TO_DOUBLE (0x89, "float-to-double"), 
	DOUBLE_TO_INT (0x8a, "double-to-int"), 
	DOUBLE_TO_LONG (0x8b, "double-to-long"), 
	DOUBLE_TO_FLOAT (0x8c, "double-to-float"), 
	INT_TO_BYTE (0x8d, "int-to-byte"), 
	INT_TO_CHAR (0x8e, "int-to-char"), 
	INT_TO_SHORT (0x8f, "int-to-short"), 
	
	ADD_INT (0x90, "add-int"), 
	SUB_INT (0x91, "sub-int"), 
	MUL_INT (0x92, "mul-int"), 
	DEV_INT (0x93, "div-int"), 
	REM_INT (0x94, "rem-int"), 
	AND_INT (0x95, "and-int"), 
	OR_INT (0x96, "or-int"), 
	XOR_INT (0x97, "xor-int"), 
	SHL_INT (0x98, "shl-int"), 
	SHR_INT (0x99, "shr-int"), 
	USHR_INT (0x9a, "ushr-int"), 
	ADD_LONG (0x9b, "add-long"), 
	SUB_LONG (0x9c, "sub-long"), 
	MUL_LONG (0x9d, "mul-long"), 
	DIV_LONG (0x9e, "div-long"), 
	REM_LONG (0x9f, "rem-long"), 
	AND_LONG (0xa0, "and-long"), 
	OR_LONG (0xa1, "or-long"), 
	XOR_LONG (0xa2, "xor-long"), 
	SHL_LONG (0xa3, "shl-long"), 
	SHR_LONG (0xa4, "shr-long"), 
	USHR_LONG (0xa5, "ushr-long"), 
	ADD_FLOAT (0xa6, "add-float"), 
	SUB_FLOAT (0xa7, "sub-float"), 
	MUL_FLOAT (0xa8, "mul-float"), 
	DIV_FLOAT (0xa9, "div-float"), 
	REM_FLOAT (0xaa, "rem-float"), 
	ADD_DOUBLE (0xab, "add-double"), 
	SUB_DOUBLE (0xac, "sub-double"), 
	MUL_DOUBLE (0xad, "mul-double"), 
	DIV_DOUBLE (0xae, "div-double"), 
	REM_DOUBLE (0xaf, "rem-double"), 
	
	ADD_INT_2ADDR (0xb0, "add-int/2addr"), 
	SUB_INT_2ADDR (0xb1, "sub-int/2addr"), 
	MUL_INT_2ADDR (0xb2, "mul-int/2addr"), 
	DIV_INT_2ADDR (0xb3, "div-int/2addr"), 
	REM_INT_2ADDR (0xb4, "rem-int/2addr"), 
	AND_INT_2ADDR (0xb5, "and-int/2addr"), 
	OR_INT_2ADDR (0xb6, "or-int/2addr"), 
	XOR_INT_2ADDR (0xb7, "xor-int/2addr"), 
	SHL_INT_2ADDR (0xb8, "shl-int/2addr"), 
	SHR_INT_2ADDR (0xb9, "shr-int/2addr"), 
	USHR_INT_2ADDR (0xba, "ushr-int/2addr"), 
	ADD_LONG_2ADDR (0xbb, "add-long/2addr"), 
	SUB_LONG_2ADDR (0xbc, "sub-long/2addr"), 
	MUL_LONG_2ADDR (0xbd, "mul-long/2addr"), 
	DIV_LONG_2ADDR (0xbe, "div-long/2addr"), 
	REM_LONG_2ADDR (0xbf, "rem-long/2addr"), 
	AND_LONG_2ADDR (0xc0, "and-long/2addr"), 
	OR_LONG_2ADDR (0xc1, "or-long/2addr"), 
	XOR_LONG_2ADDR (0xc2, "xor-long/2addr"), 
	SHL_LONG_2ADDR (0xc3, "shl-long/2addr"), 
	SHR_LONG_2ADDR (0xc4, "shr-long/2addr"), 
	USHR_LONG_2ADDR (0xc5, "ushr-long/2addr"), 
	ADD_FLOAT_2ADDR (0xc6, "add-float/2addr"), 
	SUB_FLOAT_2ADDR (0xc7, "sub-float/2addr"), 
	MUL_FLOAT_2ADDR (0xc8, "mul-float/2addr"), 
	DIV_FLOAT_2ADDR (0xc9, "div-float/2addr"), 
	REM_FLOAT_2ADDR (0xca, "rem-float/2addr"), 
	ADD_DOUBLE_2ADDR (0xcb, "add-double/2addr"), 
	SUB_DOUBLE_2ADDR (0xcc, "sub-double/2addr"), 
	MUL_DOUBLE_2ADDR (0xcd, "mul-double/2addr"), 
	DIV_DOUBLE_2ADDR (0xce, "div-double/2addr"), 
	REM_DOUBLE_2ADDR (0xcf, "rem-double/2addr"), 
	
	ADD_INT_LIT16 (0xd0, "add-int/lit16"), 
	RSUB_INT (0xd1, "rsub-int"), 
	MUL_INT_LIT16 (0xd2, "mul-int/lit16"), 
	DIV_INT_LIT16 (0xd3, "div-int/lit16"), 
	REM_INT_LIT16 (0xd4, "rem-int/lit16"), 
	AND_INT_LIT16 (0xd5, "and-int/lit16"), 
	OR_INT_LIT16 (0xd6, "or-int/lit16"), 
	XOR_INT_LIT16 (0xd7, "xor-int/lit16"), 
	ADD_INT_LIT8 (0xd8, "add-int/lit8"), 
	RSUB_INT_LIT8 (0xd9, "rsub-int/lit8"), 
	MUL_INT_LIT8 (0xda, "mul-int/lit8"), 
	DIV_INT_LIT8 (0xdb, "div-int/lit8"), 
	REM_INT_LIT8 (0xdc, "rem-int/lit8"), 
	AND_INT_LIT8 (0xdd, "and-int/lit8"), 
	OR_INT_LIT8 (0xde, "or-int/lit8"), 
	XOR_INT_LIT8 (0xdf, "xor-int/lit8"), 
	SHL_INT_LIT8 (0xe0, "shl-int/lit8"), 
	SHR_INT_LIT8 (0xe1, "shr-int/lit8"), 
	USHR_INT_LIT8 (0xe2, "ushr-int/lit8"), 
	;

	public static final Map<String, SmaliInstruction> smaliInstructions;
	
	static {
		smaliInstructions = new HashMap<String, SmaliInstruction>();
		smaliInstructions.put(MOVE.feature,MOVE);
		smaliInstructions.put(MOVE_FROM_16.feature,MOVE_FROM_16);
		smaliInstructions.put(MOVE_16.feature,MOVE_16);
		smaliInstructions.put(MOVE_WIDE.feature,MOVE_WIDE);
		smaliInstructions.put(MOVE_WIDE_FROM_16.feature,MOVE_WIDE_FROM_16);
		smaliInstructions.put(MOVE_WIDE_16.feature,MOVE_WIDE_16);
		smaliInstructions.put(MOVE_OBJECT.feature,MOVE_OBJECT);
		smaliInstructions.put(MOVE_OBJECT_FROM_16.feature,MOVE_OBJECT_FROM_16);
		smaliInstructions.put(MOVE_OBJECT_16.feature,MOVE_OBJECT_16);
			
		smaliInstructions.put(MOVE_RESULT.feature,MOVE_RESULT);
		smaliInstructions.put(MOVE_RESULT_WIDE.feature,MOVE_RESULT_WIDE);
		smaliInstructions.put(MOVE_RESULT_OBJECT.feature,MOVE_RESULT_OBJECT);
			
		smaliInstructions.put(MOVE_EXCEPTION.feature,MOVE_EXCEPTION);

		smaliInstructions.put(RETURN_VOID.feature,RETURN_VOID);
		smaliInstructions.put(RETURN.feature,RETURN);
		smaliInstructions.put(RETURN_WIDE.feature,RETURN_WIDE);
		smaliInstructions.put(RETURN_OBJECT.feature,RETURN_OBJECT);
			
		smaliInstructions.put(CONST_4.feature,CONST_4);
		smaliInstructions.put(CONST_16.feature,CONST_16);
		smaliInstructions.put(CONST.feature,CONST);
		smaliInstructions.put(CONST_HIGH_16.feature,CONST_HIGH_16);
		smaliInstructions.put(CONST_WIDE_16.feature,CONST_WIDE_16);
		smaliInstructions.put(CONST_WIDE_32.feature,CONST_WIDE_32);
		smaliInstructions.put(CONST_WIDE.feature,CONST_WIDE);
		smaliInstructions.put(CONST_WIDE_HIGH_16.feature,CONST_WIDE_HIGH_16);
		smaliInstructions.put(CONST_STRING.feature,CONST_STRING);
		smaliInstructions.put(CONST_STRING_JUMBO.feature,CONST_STRING_JUMBO);
			
		smaliInstructions.put(CONST_CLASS.feature,CONST_CLASS);
			
		smaliInstructions.put(MONITOR_ENTER.feature,MONITOR_ENTER);
			
		smaliInstructions.put(MONITOR_EXIT.feature,MONITOR_EXIT);
			
		smaliInstructions.put(CHECK_CAST.feature,CHECK_CAST);
			
		smaliInstructions.put(INSTANCE_OF.feature,INSTANCE_OF);
			
		smaliInstructions.put(ARRAY_LENGTH.feature,ARRAY_LENGTH);
			
		smaliInstructions.put(NEW_INSTANCE.feature,NEW_INSTANCE);
			
		smaliInstructions.put(NEW_ARRAY.feature,NEW_ARRAY);
			
		smaliInstructions.put(FILLED_NEW_ARRAY.feature,FILLED_NEW_ARRAY);
			
		smaliInstructions.put(FILLED_NEW_ARRAY_RANGE.feature,FILLED_NEW_ARRAY_RANGE);
			
		smaliInstructions.put(FILL_ARRAY_DATA.feature,FILL_ARRAY_DATA);
			
		smaliInstructions.put(THROW.feature,THROW);
			
		smaliInstructions.put(GOTO.feature,GOTO);
		smaliInstructions.put(GOTO_16.feature,GOTO_16);
		smaliInstructions.put(GOTO_32.feature,GOTO_32);
			
		smaliInstructions.put(PACKED_SWITCH.feature,PACKED_SWITCH);
			
		smaliInstructions.put(SPARSE_SWITCH.feature,SPARSE_SWITCH);
			
		smaliInstructions.put(CMPL_FLOAT.feature,CMPL_FLOAT);
		smaliInstructions.put(CMPG_FLOAT.feature,CMPG_FLOAT);
		smaliInstructions.put(CMPL_DOUBLE.feature,CMPL_DOUBLE);
		smaliInstructions.put(CMPG_DOUBLE.feature,CMPG_DOUBLE);
		smaliInstructions.put(CMP_LONG.feature,CMP_LONG);
			
		smaliInstructions.put(IF_EQ.feature,IF_EQ);
		smaliInstructions.put(IF_NE.feature,IF_NE);
		smaliInstructions.put(IF_LT.feature,IF_LT);
		smaliInstructions.put(IF_GE.feature,IF_GE);
		smaliInstructions.put(IF_GT.feature,IF_GT);
		smaliInstructions.put(IF_LE.feature,IF_LE);
			
		smaliInstructions.put(IF_EQZ.feature,IF_EQZ);
		smaliInstructions.put(IF_NEZ.feature,IF_NEZ);
		smaliInstructions.put(IF_LTZ.feature,IF_LTZ);
		smaliInstructions.put(IF_GEZ.feature,IF_GEZ);
		smaliInstructions.put(IF_GTZ.feature,IF_GTZ);
		smaliInstructions.put(IF_LEZ.feature,IF_LEZ);
			
		smaliInstructions.put(AGET.feature,AGET);
		smaliInstructions.put(AGET_WIDE.feature,AGET_WIDE);
		smaliInstructions.put(AGET_OBJECT.feature,AGET_OBJECT);
		smaliInstructions.put(AGET_BOOLEAN.feature,AGET_BOOLEAN);
		smaliInstructions.put(AGET_BYTE.feature,AGET_BYTE);
		smaliInstructions.put(AGET_CHAR.feature,AGET_CHAR);
		smaliInstructions.put(AGET_SHORT.feature,AGET_SHORT);
			
		smaliInstructions.put(APUT.feature,APUT);
		smaliInstructions.put(APUT_WIDE.feature,APUT_WIDE);
		smaliInstructions.put(APUT_OBJECT.feature,APUT_OBJECT);
		smaliInstructions.put(APUT_BOOLEAN.feature,APUT_BOOLEAN);
		smaliInstructions.put(APUT_BYTE.feature,APUT_BYTE);
		smaliInstructions.put(APUT_CHAR.feature,APUT_CHAR);
		smaliInstructions.put(APUT_SHORT.feature,APUT_SHORT);
			
		smaliInstructions.put(IGET.feature,IGET);
		smaliInstructions.put(IGET_WIDE.feature,IGET_WIDE);
		smaliInstructions.put(IGET_OBJECT.feature,IGET_OBJECT);
		smaliInstructions.put(IGET_BOOLEAN.feature,IGET_BOOLEAN);
		smaliInstructions.put(IGET_BYTE.feature,IGET_BYTE);
		smaliInstructions.put(IGET_CHAR.feature,IGET_CHAR);
		smaliInstructions.put(IGET_SHORT.feature,IGET_SHORT);
			
		smaliInstructions.put(IPUT.feature,IPUT);
		smaliInstructions.put(IPUT_WIDE.feature,IPUT_WIDE);
		smaliInstructions.put(IPUT_OBJECT.feature,IPUT_OBJECT);
		smaliInstructions.put(IPUT_BOOLEAN.feature,IPUT_BOOLEAN);
		smaliInstructions.put(IPUT_BYTE.feature,IPUT_BYTE);
		smaliInstructions.put(IPUT_CHAR.feature,IPUT_CHAR);
		smaliInstructions.put(IPUT_SHORT.feature,IPUT_SHORT);
			
		smaliInstructions.put(SGET.feature,SGET);
		smaliInstructions.put(SGET_WIDE.feature,SGET_WIDE);
		smaliInstructions.put(SGET_OBJECT.feature,SGET_OBJECT);
		smaliInstructions.put(SGET_BOOLEAN.feature,SGET_BOOLEAN);
		smaliInstructions.put(SGET_BYTE.feature,SGET_BYTE);
		smaliInstructions.put(SGET_CHAR.feature,SGET_CHAR);
		smaliInstructions.put(SGET_SHORT.feature,SGET_SHORT);
			
		smaliInstructions.put(SPUT.feature,SPUT);
		smaliInstructions.put(SPUT_WIDE.feature,SPUT_WIDE);
		smaliInstructions.put(SPUT_OBJECT.feature,SPUT_OBJECT);
		smaliInstructions.put(SPUT_BOOLEAN.feature,SPUT_BOOLEAN);
		smaliInstructions.put(SPUT_BYTE.feature,SPUT_BYTE);
		smaliInstructions.put(SPUT_CHAR.feature,SPUT_CHAR);
		smaliInstructions.put(SPUT_SHORT.feature,SPUT_SHORT);
			
		smaliInstructions.put(INVOKE_VIRTUAL.feature,INVOKE_VIRTUAL);
		smaliInstructions.put(INVOKE_SUPER.feature,INVOKE_SUPER);
		smaliInstructions.put(INVOKE_DIRECT.feature,INVOKE_DIRECT);
		smaliInstructions.put(INVOKE_STATIC.feature,INVOKE_STATIC);
		smaliInstructions.put(INVOKE_INTERFACE.feature,INVOKE_INTERFACE);
			
		smaliInstructions.put(INVOKE_VIRTUAL_RANGE.feature,INVOKE_VIRTUAL_RANGE);
		smaliInstructions.put(INVOKE_SUPER_RANGE.feature,INVOKE_SUPER_RANGE);
		smaliInstructions.put(INVOKE_DIRECT_RANGE.feature,INVOKE_DIRECT_RANGE);
		smaliInstructions.put(INVOKE_STATIC_RANGE.feature,INVOKE_STATIC_RANGE);
		smaliInstructions.put(INVOKE_INTERFACE_RANGE.feature,INVOKE_INTERFACE_RANGE);
			
		smaliInstructions.put(NEG_INT.feature,NEG_INT);
		smaliInstructions.put(NOT_INT.feature,NOT_INT);
		smaliInstructions.put(NEG_LONG.feature,NEG_LONG);
		smaliInstructions.put(NOT_LONG.feature,NOT_LONG);
		smaliInstructions.put(NEG_FLOAT.feature,NEG_FLOAT);
		smaliInstructions.put(NEG_DOUBLE.feature,NEG_DOUBLE);
		smaliInstructions.put(INT_TO_LONG.feature,INT_TO_LONG);
		smaliInstructions.put(INT_TO_FLOAT.feature,INT_TO_FLOAT);
		smaliInstructions.put(INT_TO_DOUBLE.feature,INT_TO_DOUBLE);
		smaliInstructions.put(LONG_TO_INT.feature,LONG_TO_INT);
		smaliInstructions.put(LONG_TO_FLOAT.feature,LONG_TO_FLOAT);
		smaliInstructions.put(LONG_TO_DOUBLE.feature,LONG_TO_DOUBLE);
		smaliInstructions.put(FLOAT_TO_INT.feature,FLOAT_TO_INT);
		smaliInstructions.put(FLOAT_TO_LONG.feature,FLOAT_TO_LONG);
		smaliInstructions.put(FLOAT_TO_DOUBLE.feature,FLOAT_TO_DOUBLE);
		smaliInstructions.put(DOUBLE_TO_INT.feature,DOUBLE_TO_INT);
		smaliInstructions.put(DOUBLE_TO_LONG.feature,DOUBLE_TO_LONG);
		smaliInstructions.put(DOUBLE_TO_FLOAT.feature,DOUBLE_TO_FLOAT);
		smaliInstructions.put(INT_TO_BYTE.feature,INT_TO_BYTE);
		smaliInstructions.put(INT_TO_CHAR.feature,INT_TO_CHAR);
		smaliInstructions.put(INT_TO_SHORT.feature,INT_TO_SHORT);
			
		smaliInstructions.put(ADD_INT.feature,ADD_INT);
		smaliInstructions.put(SUB_INT.feature,SUB_INT);
		smaliInstructions.put(MUL_INT.feature,MUL_INT);
		smaliInstructions.put(DEV_INT.feature,DEV_INT);
		smaliInstructions.put(REM_INT.feature,REM_INT);
		smaliInstructions.put(AND_INT.feature,AND_INT);
		smaliInstructions.put(OR_INT.feature,OR_INT);
		smaliInstructions.put(XOR_INT.feature,XOR_INT);
		smaliInstructions.put(SHL_INT.feature,SHL_INT);
		smaliInstructions.put(SHR_INT.feature,SHR_INT);
		smaliInstructions.put(USHR_INT.feature,USHR_INT);
		smaliInstructions.put(ADD_LONG.feature,ADD_LONG);
		smaliInstructions.put(SUB_LONG.feature,SUB_LONG);
		smaliInstructions.put(MUL_LONG.feature,MUL_LONG);
		smaliInstructions.put(DIV_LONG.feature,DIV_LONG);
		smaliInstructions.put(REM_LONG.feature,REM_LONG);
		smaliInstructions.put(AND_LONG.feature,AND_LONG);
		smaliInstructions.put(OR_LONG.feature,OR_LONG);
		smaliInstructions.put(XOR_LONG.feature,XOR_LONG);
		smaliInstructions.put(SHL_LONG.feature,SHL_LONG);
		smaliInstructions.put(SHR_LONG.feature,SHR_LONG);
		smaliInstructions.put(USHR_LONG.feature,USHR_LONG);
		smaliInstructions.put(ADD_FLOAT.feature,ADD_FLOAT);
		smaliInstructions.put(SUB_FLOAT.feature,SUB_FLOAT);
		smaliInstructions.put(MUL_FLOAT.feature,MUL_FLOAT);
		smaliInstructions.put(DIV_FLOAT.feature,DIV_FLOAT);
		smaliInstructions.put(REM_FLOAT.feature,REM_FLOAT);
		smaliInstructions.put(ADD_DOUBLE.feature,ADD_DOUBLE);
		smaliInstructions.put(SUB_DOUBLE.feature,SUB_DOUBLE);
		smaliInstructions.put(MUL_DOUBLE.feature,MUL_DOUBLE);
		smaliInstructions.put(DIV_DOUBLE.feature,DIV_DOUBLE);
		smaliInstructions.put(REM_DOUBLE.feature,REM_DOUBLE);
			
		smaliInstructions.put(ADD_INT_2ADDR.feature,ADD_INT_2ADDR);
		smaliInstructions.put(SUB_INT_2ADDR.feature,SUB_INT_2ADDR);
		smaliInstructions.put(MUL_INT_2ADDR.feature,MUL_INT_2ADDR);
		smaliInstructions.put(DIV_INT_2ADDR.feature,DIV_INT_2ADDR);
		smaliInstructions.put(REM_INT_2ADDR.feature,REM_INT_2ADDR);
		smaliInstructions.put(AND_INT_2ADDR.feature,AND_INT_2ADDR);
		smaliInstructions.put(OR_INT_2ADDR.feature,OR_INT_2ADDR);
		smaliInstructions.put(XOR_INT_2ADDR.feature,XOR_INT_2ADDR);
		smaliInstructions.put(SHL_INT_2ADDR.feature,SHL_INT_2ADDR);
		smaliInstructions.put(SHR_INT_2ADDR.feature,SHR_INT_2ADDR);
		smaliInstructions.put(USHR_INT_2ADDR.feature,USHR_INT_2ADDR);
		smaliInstructions.put(ADD_LONG_2ADDR.feature,ADD_LONG_2ADDR);
		smaliInstructions.put(SUB_LONG_2ADDR.feature,SUB_LONG_2ADDR);
		smaliInstructions.put(MUL_LONG_2ADDR.feature,MUL_LONG_2ADDR);
		smaliInstructions.put(DIV_LONG_2ADDR.feature,DIV_LONG_2ADDR);
		smaliInstructions.put(REM_LONG_2ADDR.feature,REM_LONG_2ADDR);
		smaliInstructions.put(AND_LONG_2ADDR.feature,AND_LONG_2ADDR);
		smaliInstructions.put(OR_LONG_2ADDR.feature,OR_LONG_2ADDR);
		smaliInstructions.put(XOR_LONG_2ADDR.feature,XOR_LONG_2ADDR);
		smaliInstructions.put(SHL_LONG_2ADDR.feature,SHL_LONG_2ADDR);
		smaliInstructions.put(SHR_LONG_2ADDR.feature,SHR_LONG_2ADDR);
		smaliInstructions.put(USHR_LONG_2ADDR.feature,USHR_LONG_2ADDR);
		smaliInstructions.put(ADD_FLOAT_2ADDR.feature,ADD_FLOAT_2ADDR);
		smaliInstructions.put(SUB_FLOAT_2ADDR.feature,SUB_FLOAT_2ADDR);
		smaliInstructions.put(MUL_FLOAT_2ADDR.feature,MUL_FLOAT_2ADDR);
		smaliInstructions.put(DIV_FLOAT_2ADDR.feature,DIV_FLOAT_2ADDR);
		smaliInstructions.put(REM_FLOAT_2ADDR.feature,REM_FLOAT_2ADDR);
		smaliInstructions.put(ADD_DOUBLE_2ADDR.feature,ADD_DOUBLE_2ADDR);
		smaliInstructions.put(SUB_DOUBLE_2ADDR.feature,SUB_DOUBLE_2ADDR);
		smaliInstructions.put(MUL_DOUBLE_2ADDR.feature,MUL_DOUBLE_2ADDR);
		smaliInstructions.put(DIV_DOUBLE_2ADDR.feature,DIV_DOUBLE_2ADDR);
		smaliInstructions.put(REM_DOUBLE_2ADDR.feature,REM_DOUBLE_2ADDR);
			
		smaliInstructions.put(ADD_INT_LIT16.feature,ADD_INT_LIT16);
		smaliInstructions.put(RSUB_INT.feature,RSUB_INT);
		smaliInstructions.put(MUL_INT_LIT16.feature,MUL_INT_LIT16);
		smaliInstructions.put(DIV_INT_LIT16.feature,DIV_INT_LIT16);
		smaliInstructions.put(REM_INT_LIT16.feature,REM_INT_LIT16);
		smaliInstructions.put(AND_INT_LIT16.feature,AND_INT_LIT16);
		smaliInstructions.put(OR_INT_LIT16.feature,OR_INT_LIT16);
		smaliInstructions.put(XOR_INT_LIT16.feature,XOR_INT_LIT16);
		smaliInstructions.put(ADD_INT_LIT8.feature,ADD_INT_LIT8);
		smaliInstructions.put(RSUB_INT_LIT8.feature,RSUB_INT_LIT8);
		smaliInstructions.put(MUL_INT_LIT8.feature,MUL_INT_LIT8);
		smaliInstructions.put(DIV_INT_LIT8.feature,DIV_INT_LIT8);
		smaliInstructions.put(REM_INT_LIT8.feature,REM_INT_LIT8);
		smaliInstructions.put(AND_INT_LIT8.feature,AND_INT_LIT8);
		smaliInstructions.put(OR_INT_LIT8.feature,OR_INT_LIT8);
		smaliInstructions.put(XOR_INT_LIT8.feature,XOR_INT_LIT8);
		smaliInstructions.put(SHL_INT_LIT8.feature,SHL_INT_LIT8);
		smaliInstructions.put(SHR_INT_LIT8.feature,SHR_INT_LIT8);
		smaliInstructions.put(USHR_INT_LIT8.feature,USHR_INT_LIT8);
	}
	
	public int id;
	
	public String feature;
	
	SmaliInstruction(int id, String feature) {
		this.id = id;
		this.feature = feature;
	}
	
}
