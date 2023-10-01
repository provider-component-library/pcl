package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I73Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b10Provider;
    @Hard
    private final Provider<Integer> b14Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b28Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b38Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b45Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i86Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i93Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i100Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i122Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i161Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i166Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i196Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b2Provider.get(request);
		int p2Val = b7Provider.get(request);
		int p3Val = b10Provider.get(request);
		int p4Val = b14Provider.get(request);
		
        try {
            Thread.sleep(28);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p5Val = b18Provider.get(request);
		int p6Val = b22Provider.get(request);
		int p7Val = b24Provider.get(request);
		int p8Val = b28Provider.get(request);
		int p9Val = b30Provider.get(request);
		int p10Val = b31Provider.get(request);
		int p11Val = b32Provider.get(request);
		int p12Val = b34Provider.get(request);
		int p13Val = b36Provider.get(request);
		int p14Val = b37Provider.get(request);
		int p15Val = b38Provider.get(request);
		int p16Val = b40Provider.get(request);
		int p17Val = b45Provider.get(request);
		
        try {
            Thread.sleep(59);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p18Val = b47Provider.get(request);
		int p19Val = b49Provider.get(request);
		int p20Val = b50Provider.get(request);
		int p21Val = i74Provider.get(request);
		int p22Val = i75Provider.get(request);
		int p23Val = i82Provider.get(request);
		int p24Val = i86Provider.get(request);
		int p25Val = i89Provider.get(request);
		int p26Val = i93Provider.get(request);
		int p27Val = i94Provider.get(request);
		int p28Val = i98Provider.get(request);
		int p29Val = i99Provider.get(request);
		int p30Val = i100Provider.get(request);
		int p31Val = i101Provider.get(request);
		int p32Val = i104Provider.get(request);
		int p33Val = i106Provider.get(request);
		int p34Val = i110Provider.get(request);
		int p35Val = i114Provider.get(request);
		int p36Val = i116Provider.get(request);
		int p37Val = i120Provider.get(request);
		int p38Val = i122Provider.get(request);
		int p39Val = i124Provider.get(request);
		int p40Val = i126Provider.get(request);
		int p41Val = i132Provider.get(request);
		int p42Val = i133Provider.get(request);
		int p43Val = i134Provider.get(request);
		int p44Val = i139Provider.get(request);
		int p45Val = i141Provider.get(request);
		int p46Val = i142Provider.get(request);
		int p47Val = i145Provider.get(request);
		int p48Val = i148Provider.get(request);
		int p49Val = i150Provider.get(request);
		int p50Val = i161Provider.get(request);
		int p51Val = i165Provider.get(request);
		int p52Val = i166Provider.get(request);
		int p53Val = i168Provider.get(request);
		int p54Val = i169Provider.get(request);
		int p55Val = i175Provider.get(request);
		int p56Val = i177Provider.get(request);
		int p57Val = i179Provider.get(request);
		int p58Val = i180Provider.get(request);
		
        try {
            Thread.sleep(44);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p59Val = i184Provider.get(request);
		int p60Val = i185Provider.get(request);
		int p61Val = i190Provider.get(request);
		int p62Val = i191Provider.get(request);
		int p63Val = i192Provider.get(request);
		int p64Val = i196Provider.get(request);
		int p65Val = i199Provider.get(request);

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
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val;
    }
}
