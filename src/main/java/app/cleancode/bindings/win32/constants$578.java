// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$578 {

    static final FunctionDescriptor PFN_CRYPT_ENUM_OID_INFO$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ENUM_OID_INFO$MH = RuntimeHelper.downcallHandle(
        constants$578.PFN_CRYPT_ENUM_OID_INFO$FUNC
    );
    static final FunctionDescriptor CryptEnumOIDInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumOIDInfo$MH = RuntimeHelper.downcallHandle(
        "CryptEnumOIDInfo",
        constants$578.CryptEnumOIDInfo$FUNC
    );
    static final FunctionDescriptor CryptFindLocalizedName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptFindLocalizedName$MH = RuntimeHelper.downcallHandle(
        "CryptFindLocalizedName",
        constants$578.CryptFindLocalizedName$FUNC
    );
    static final FunctionDescriptor PFN_CMSG_STREAM_OUTPUT$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PFN_CMSG_STREAM_OUTPUT$MH = RuntimeHelper.downcallHandle(
        constants$578.PFN_CMSG_STREAM_OUTPUT$FUNC
    );
    static final FunctionDescriptor CryptMsgOpenToEncode$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgOpenToEncode$MH = RuntimeHelper.downcallHandle(
        "CryptMsgOpenToEncode",
        constants$578.CryptMsgOpenToEncode$FUNC
    );
}


