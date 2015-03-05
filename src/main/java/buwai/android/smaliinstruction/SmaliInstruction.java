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
	}
	
	public int id;
	
	public String feature;
	
	SmaliInstruction(int id, String feature) {
		this.id = id;
		this.feature = feature;
	}
	
}
