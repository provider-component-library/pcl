package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I128Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b15Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b19Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i144Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i195Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b3Provider.get(request);
		int p2Val = b5Provider.get(request);
		int p3Val = b7Provider.get(request);
		int p4Val = b14Provider.get(request);
		int p5Val = b15Provider.get(request);
		int p6Val = b17Provider.get(request);
		int p7Val = b19Provider.get(request);
		int p8Val = b23Provider.get(request);
		int p9Val = b26Provider.get(request);
		int p10Val = b27Provider.get(request);
		
        try {
            Thread.sleep(54);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
        try {
            Thread.sleep(45);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p11Val = b28Provider.get(request);
		int p12Val = b29Provider.get(request);
		int p13Val = b39Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = b48Provider.get(request);
		int p17Val = b49Provider.get(request);
		int p18Val = b50Provider.get(request);
		int p19Val = i130Provider.get(request);
		int p20Val = i139Provider.get(request);
		int p21Val = i140Provider.get(request);
		int p22Val = i141Provider.get(request);
		int p23Val = i142Provider.get(request);
		int p24Val = i143Provider.get(request);
		int p25Val = i144Provider.get(request);
		int p26Val = i151Provider.get(request);
		int p27Val = i152Provider.get(request);
		int p28Val = i153Provider.get(request);
		int p29Val = i163Provider.get(request);
		int p30Val = i166Provider.get(request);
		int p31Val = i170Provider.get(request);
		int p32Val = i171Provider.get(request);
		int p33Val = i172Provider.get(request);
		int p34Val = i176Provider.get(request);
		int p35Val = i179Provider.get(request);
		int p36Val = i183Provider.get(request);
		
        try {
            Thread.sleep(32);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p37Val = i188Provider.get(request);
		int p38Val = i189Provider.get(request);
		int p39Val = i195Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val;
    }
}
