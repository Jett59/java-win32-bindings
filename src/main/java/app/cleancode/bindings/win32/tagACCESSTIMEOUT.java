// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagACCESSTIMEOUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("iTimeOutMSec")
    ).withName("tagACCESSTIMEOUT");
    public static MemoryLayout $LAYOUT() {
        return tagACCESSTIMEOUT.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagACCESSTIMEOUT.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagACCESSTIMEOUT.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagACCESSTIMEOUT.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagACCESSTIMEOUT.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagACCESSTIMEOUT.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagACCESSTIMEOUT.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagACCESSTIMEOUT.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagACCESSTIMEOUT.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagACCESSTIMEOUT.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagACCESSTIMEOUT.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iTimeOutMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iTimeOutMSec"));
    public static VarHandle iTimeOutMSec$VH() {
        return tagACCESSTIMEOUT.iTimeOutMSec$VH;
    }
    public static int iTimeOutMSec$get(MemorySegment seg) {
        return (int)tagACCESSTIMEOUT.iTimeOutMSec$VH.get(seg);
    }
    public static void iTimeOutMSec$set( MemorySegment seg, int x) {
        tagACCESSTIMEOUT.iTimeOutMSec$VH.set(seg, x);
    }
    public static int iTimeOutMSec$get(MemorySegment seg, long index) {
        return (int)tagACCESSTIMEOUT.iTimeOutMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iTimeOutMSec$set(MemorySegment seg, long index, int x) {
        tagACCESSTIMEOUT.iTimeOutMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


