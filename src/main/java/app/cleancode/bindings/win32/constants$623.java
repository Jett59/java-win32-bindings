// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$623 {

    static final FunctionDescriptor PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$623.PFN_CRYPT_ASYNC_PARAM_FREE_FUNC$FUNC
    );
    static final FunctionDescriptor CryptCreateAsyncHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCreateAsyncHandle$MH = RuntimeHelper.downcallHandle(
        "CryptCreateAsyncHandle",
        constants$623.CryptCreateAsyncHandle$FUNC
    );
    static final FunctionDescriptor CryptSetAsyncParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSetAsyncParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetAsyncParam",
        constants$623.CryptSetAsyncParam$FUNC
    );
    static final FunctionDescriptor CryptGetAsyncParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGetAsyncParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetAsyncParam",
        constants$623.CryptGetAsyncParam$FUNC
    );
    static final FunctionDescriptor CryptCloseAsyncHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCloseAsyncHandle$MH = RuntimeHelper.downcallHandle(
        "CryptCloseAsyncHandle",
        constants$623.CryptCloseAsyncHandle$FUNC
    );
    static final FunctionDescriptor PFN_FREE_ENCODED_OBJECT_FUNC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


