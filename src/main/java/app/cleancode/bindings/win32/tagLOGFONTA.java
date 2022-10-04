// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagLOGFONTA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
        Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
        Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
        Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
        Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
        Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
        Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
        Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
        Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
        Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
        Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
        Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
        Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("lfFaceName")
    ).withName("tagLOGFONTA");
    public static MemoryLayout $LAYOUT() {
        return tagLOGFONTA.$struct$LAYOUT;
    }
    static final VarHandle lfHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfHeight"));
    public static VarHandle lfHeight$VH() {
        return tagLOGFONTA.lfHeight$VH;
    }
    public static int lfHeight$get(MemorySegment seg) {
        return (int)tagLOGFONTA.lfHeight$VH.get(seg);
    }
    public static void lfHeight$set( MemorySegment seg, int x) {
        tagLOGFONTA.lfHeight$VH.set(seg, x);
    }
    public static int lfHeight$get(MemorySegment seg, long index) {
        return (int)tagLOGFONTA.lfHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfHeight$set(MemorySegment seg, long index, int x) {
        tagLOGFONTA.lfHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfWidth"));
    public static VarHandle lfWidth$VH() {
        return tagLOGFONTA.lfWidth$VH;
    }
    public static int lfWidth$get(MemorySegment seg) {
        return (int)tagLOGFONTA.lfWidth$VH.get(seg);
    }
    public static void lfWidth$set( MemorySegment seg, int x) {
        tagLOGFONTA.lfWidth$VH.set(seg, x);
    }
    public static int lfWidth$get(MemorySegment seg, long index) {
        return (int)tagLOGFONTA.lfWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfWidth$set(MemorySegment seg, long index, int x) {
        tagLOGFONTA.lfWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfEscapement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfEscapement"));
    public static VarHandle lfEscapement$VH() {
        return tagLOGFONTA.lfEscapement$VH;
    }
    public static int lfEscapement$get(MemorySegment seg) {
        return (int)tagLOGFONTA.lfEscapement$VH.get(seg);
    }
    public static void lfEscapement$set( MemorySegment seg, int x) {
        tagLOGFONTA.lfEscapement$VH.set(seg, x);
    }
    public static int lfEscapement$get(MemorySegment seg, long index) {
        return (int)tagLOGFONTA.lfEscapement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfEscapement$set(MemorySegment seg, long index, int x) {
        tagLOGFONTA.lfEscapement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfOrientation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfOrientation"));
    public static VarHandle lfOrientation$VH() {
        return tagLOGFONTA.lfOrientation$VH;
    }
    public static int lfOrientation$get(MemorySegment seg) {
        return (int)tagLOGFONTA.lfOrientation$VH.get(seg);
    }
    public static void lfOrientation$set( MemorySegment seg, int x) {
        tagLOGFONTA.lfOrientation$VH.set(seg, x);
    }
    public static int lfOrientation$get(MemorySegment seg, long index) {
        return (int)tagLOGFONTA.lfOrientation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfOrientation$set(MemorySegment seg, long index, int x) {
        tagLOGFONTA.lfOrientation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfWeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfWeight"));
    public static VarHandle lfWeight$VH() {
        return tagLOGFONTA.lfWeight$VH;
    }
    public static int lfWeight$get(MemorySegment seg) {
        return (int)tagLOGFONTA.lfWeight$VH.get(seg);
    }
    public static void lfWeight$set( MemorySegment seg, int x) {
        tagLOGFONTA.lfWeight$VH.set(seg, x);
    }
    public static int lfWeight$get(MemorySegment seg, long index) {
        return (int)tagLOGFONTA.lfWeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfWeight$set(MemorySegment seg, long index, int x) {
        tagLOGFONTA.lfWeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfItalic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfItalic"));
    public static VarHandle lfItalic$VH() {
        return tagLOGFONTA.lfItalic$VH;
    }
    public static byte lfItalic$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfItalic$VH.get(seg);
    }
    public static void lfItalic$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfItalic$VH.set(seg, x);
    }
    public static byte lfItalic$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfItalic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfItalic$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfItalic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfUnderline$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfUnderline"));
    public static VarHandle lfUnderline$VH() {
        return tagLOGFONTA.lfUnderline$VH;
    }
    public static byte lfUnderline$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfUnderline$VH.get(seg);
    }
    public static void lfUnderline$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfUnderline$VH.set(seg, x);
    }
    public static byte lfUnderline$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfUnderline$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfUnderline$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfUnderline$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfStrikeOut$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfStrikeOut"));
    public static VarHandle lfStrikeOut$VH() {
        return tagLOGFONTA.lfStrikeOut$VH;
    }
    public static byte lfStrikeOut$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfStrikeOut$VH.get(seg);
    }
    public static void lfStrikeOut$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfStrikeOut$VH.set(seg, x);
    }
    public static byte lfStrikeOut$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfStrikeOut$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfStrikeOut$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfStrikeOut$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfCharSet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfCharSet"));
    public static VarHandle lfCharSet$VH() {
        return tagLOGFONTA.lfCharSet$VH;
    }
    public static byte lfCharSet$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfCharSet$VH.get(seg);
    }
    public static void lfCharSet$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfCharSet$VH.set(seg, x);
    }
    public static byte lfCharSet$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfCharSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfCharSet$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfCharSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfOutPrecision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfOutPrecision"));
    public static VarHandle lfOutPrecision$VH() {
        return tagLOGFONTA.lfOutPrecision$VH;
    }
    public static byte lfOutPrecision$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfOutPrecision$VH.get(seg);
    }
    public static void lfOutPrecision$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfOutPrecision$VH.set(seg, x);
    }
    public static byte lfOutPrecision$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfOutPrecision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfOutPrecision$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfOutPrecision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfClipPrecision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfClipPrecision"));
    public static VarHandle lfClipPrecision$VH() {
        return tagLOGFONTA.lfClipPrecision$VH;
    }
    public static byte lfClipPrecision$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfClipPrecision$VH.get(seg);
    }
    public static void lfClipPrecision$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfClipPrecision$VH.set(seg, x);
    }
    public static byte lfClipPrecision$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfClipPrecision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfClipPrecision$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfClipPrecision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfQuality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfQuality"));
    public static VarHandle lfQuality$VH() {
        return tagLOGFONTA.lfQuality$VH;
    }
    public static byte lfQuality$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfQuality$VH.get(seg);
    }
    public static void lfQuality$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfQuality$VH.set(seg, x);
    }
    public static byte lfQuality$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfQuality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfQuality$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfQuality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lfPitchAndFamily$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lfPitchAndFamily"));
    public static VarHandle lfPitchAndFamily$VH() {
        return tagLOGFONTA.lfPitchAndFamily$VH;
    }
    public static byte lfPitchAndFamily$get(MemorySegment seg) {
        return (byte)tagLOGFONTA.lfPitchAndFamily$VH.get(seg);
    }
    public static void lfPitchAndFamily$set( MemorySegment seg, byte x) {
        tagLOGFONTA.lfPitchAndFamily$VH.set(seg, x);
    }
    public static byte lfPitchAndFamily$get(MemorySegment seg, long index) {
        return (byte)tagLOGFONTA.lfPitchAndFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lfPitchAndFamily$set(MemorySegment seg, long index, byte x) {
        tagLOGFONTA.lfPitchAndFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfFaceName$slice(MemorySegment seg) {
        return seg.asSlice(28, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


